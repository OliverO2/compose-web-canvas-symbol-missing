plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.${rootProject.name}"
version = "0.0-SNAPSHOT"

// If a Compose compiler release compatible with the intended Kotlin compiler version is missing,
// select a pre-release compiler from https://androidx.dev/storage/compose-compiler/repository.
// Otherwise, use an empty string.
val composeCompilerVersion: String = "" // "1.2.1-dev-k1.7.10-27cf0868d10"

val composeCompilerArgs: List<String> = listOf(
    "-P",
    "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=true"
)

if (composeCompilerVersion.isNotEmpty()) {
    configurations.all {
        resolutionStrategy.dependencySubstitution {
            substitute(module("org.jetbrains.compose.compiler:compiler"))
                .using(module("androidx.compose.compiler:compiler:$composeCompilerVersion"))
                .because("using the compose prerelease compiler")
        }
    }
}

if (composeCompilerArgs.isNotEmpty()) {
    tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
        kotlinOptions.freeCompilerArgs += composeCompilerArgs
    }
}

val javaLanguageVersion = JavaLanguageVersion.of(11)

java {
    toolchain.languageVersion.set(javaLanguageVersion)
}

compose {
    experimental.web.application {}
}

kotlin {
    js("frontendJs", IR) {
        browser {
            useCommonJs()
            binaries.executable()
        }
    }

    sourceSets {
        @Suppress("UNUSED_VARIABLE")
        val commonMain by getting {
            dependencies {
                implementation(compose.material)
            }
        }

        @Suppress("UNUSED_VARIABLE")
        val frontendJsMain by getting {
            dependencies {
                implementation(compose.web.core)
            }
        }
    }
}

tasks {
    // WORKAROUND "Execution optimizations have been disabled for task ':frontendJsProcessResources'"
    named("frontendJsProcessResources") {
        dependsOn("unpackSkikoWasmRuntimeFrontendJs")
    }
    named("frontendJsBrowserProductionRun") {
        dependsOn("frontendJsProductionExecutableCompileSync")
    }
}
