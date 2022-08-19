### Missing Symbol with Compose for Web (1.2.0-alpha01-dev755) on Canvas

This fails:
* `./gradlew clean frontendJsBrowserDevelopmentRun`

This works:
* `./gradlew clean frontendJsBrowserProductionRun`

#### Error

```
Module "androidx.compose.foundation:foundation" has a reference to symbol [ File '/mnt/agent/work/24a6d4ab147eab50/compose/frameworks/support/compose/foundation/foundation/src/commonMain/kotlin/androidx/compose/foundation/lazy/grid/LazyGridLayoutInfo.kt' <- androidx.compose.foundation.lazy.grid/EmptyLazyGridLayoutInfo|null[0] ]. Neither the module itself nor its dependencies contain such declaration.

This could happen if the required dependency is missing in the project. Or if there is a dependency of "androidx.compose.foundation:foundation" that has a different version in the project than the version that "androidx.compose.foundation:foundation" was initially compiled with. Please check that the project configuration is correct and has consistent versions of all required dependencies.

The list of "androidx.compose.foundation:foundation" dependencies that may lead to conflicts:
 1. "kotlin" (a library with unknown version)
 2. "androidx.compose.animation:animation" (a library with unknown version)
 3. "androidx.compose.animation:animation-core" (a library with unknown version)
 4. "androidx.compose.foundation:foundation-layout" (a library with unknown version)
 5. "androidx.compose.runtime:runtime" (a library with unknown version)
 6. "androidx.compose.runtime:runtime-saveable" (a library with unknown version)
 7. "androidx.compose.ui:ui" (a library with unknown version)
 8. "androidx.compose.ui:ui-geometry" (a library with unknown version)
 9. "androidx.compose.ui:ui-graphics" (a library with unknown version)
10. "androidx.compose.ui:ui-text" (a library with unknown version)
11. "androidx.compose.ui:ui-unit" (a library with unknown version)
12. "androidx.compose.ui:ui-util" (a library with unknown version)
13. "org.jetbrains.skiko:skiko" (a library with unknown version)
14. "org.jetbrains.kotlinx:atomicfu" (a library with unknown version)
15. "org.jetbrains.kotlinx:kotlinx-coroutines-core" (a library with unknown version)

Project dependencies:
+--- kotlin
+--- androidx.compose.animation:animation
|    +--- kotlin
|    +--- androidx.compose.animation:animation-core
|    |    +--- kotlin
|    |    +--- androidx.compose.runtime:runtime
|    |    |    +--- kotlin
|    |    |    +--- org.jetbrains.kotlinx:atomicfu
|    |    |    |    \--- kotlin
|    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core
|    |    |         +--- kotlin
|    |    |         \--- org.jetbrains.kotlinx:atomicfu (*)
|    |    +--- androidx.compose.runtime:runtime-saveable
|    |    |    +--- kotlin
|    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    +--- androidx.compose.ui:ui
|    |    |    +--- kotlin
|    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    +--- androidx.compose.runtime:runtime-saveable (*)
|    |    |    +--- androidx.compose.ui:ui-geometry
|    |    |    |    +--- kotlin
|    |    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    |    +--- androidx.compose.ui:ui-util
|    |    |    |    |    \--- kotlin
|    |    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    |    +--- androidx.compose.ui:ui-graphics
|    |    |    |    +--- kotlin
|    |    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    |    +--- androidx.compose.ui:ui-geometry (*)
|    |    |    |    +--- androidx.compose.ui:ui-unit
|    |    |    |    |    +--- kotlin
|    |    |    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    |    |    +--- androidx.compose.ui:ui-geometry (*)
|    |    |    |    |    +--- androidx.compose.ui:ui-util (*)
|    |    |    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    |    |    +--- androidx.compose.ui:ui-util (*)
|    |    |    |    +--- org.jetbrains.skiko:skiko
|    |    |    |    |    +--- kotlin
|    |    |    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    |    +--- androidx.compose.ui:ui-text
|    |    |    |    +--- kotlin
|    |    |    |    +--- androidx.compose.runtime:runtime (*)
|    |    |    |    +--- androidx.compose.runtime:runtime-saveable (*)
|    |    |    |    +--- androidx.compose.ui:ui-geometry (*)
|    |    |    |    +--- androidx.compose.ui:ui-graphics (*)
|    |    |    |    +--- androidx.compose.ui:ui-unit (*)
|    |    |    |    +--- androidx.compose.ui:ui-util (*)
|    |    |    |    +--- org.jetbrains.skiko:skiko (*)
|    |    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    |    +--- androidx.compose.ui:ui-unit (*)
|    |    |    +--- androidx.compose.ui:ui-util (*)
|    |    |    +--- org.jetbrains.skiko:skiko (*)
|    |    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    |    +--- androidx.compose.ui:ui-geometry (*)
|    |    +--- androidx.compose.ui:ui-graphics (*)
|    |    +--- androidx.compose.ui:ui-text (*)
|    |    +--- androidx.compose.ui:ui-unit (*)
|    |    +--- androidx.compose.ui:ui-util (*)
|    |    +--- org.jetbrains.skiko:skiko (*)
|    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    +--- androidx.compose.foundation:foundation-layout
|    |    +--- kotlin
|    |    +--- androidx.compose.runtime:runtime (*)
|    |    +--- androidx.compose.runtime:runtime-saveable (*)
|    |    +--- androidx.compose.ui:ui (*)
|    |    +--- androidx.compose.ui:ui-geometry (*)
|    |    +--- androidx.compose.ui:ui-graphics (*)
|    |    +--- androidx.compose.ui:ui-text (*)
|    |    +--- androidx.compose.ui:ui-unit (*)
|    |    +--- androidx.compose.ui:ui-util (*)
|    |    +--- org.jetbrains.skiko:skiko (*)
|    |    +--- org.jetbrains.kotlinx:atomicfu (*)
|    |    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
|    +--- androidx.compose.runtime:runtime (*)
|    +--- androidx.compose.runtime:runtime-saveable (*)
|    +--- androidx.compose.ui:ui (*)
|    +--- androidx.compose.ui:ui-geometry (*)
|    +--- androidx.compose.ui:ui-graphics (*)
|    +--- androidx.compose.ui:ui-text (*)
|    +--- androidx.compose.ui:ui-unit (*)
|    +--- androidx.compose.ui:ui-util (*)
|    +--- org.jetbrains.skiko:skiko (*)
|    +--- org.jetbrains.kotlinx:atomicfu (*)
|    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
+--- androidx.compose.animation:animation-core (*)
+--- androidx.compose.foundation:foundation
|    ^^^ This module requires symbol [ File '/mnt/agent/work/24a6d4ab147eab50/compose/frameworks/support/compose/foundation/foundation/src/commonMain/kotlin/androidx/compose/foundation/lazy/grid/LazyGridLayoutInfo.kt' <- androidx.compose.foundation.lazy.grid/EmptyLazyGridLayoutInfo|null[0] ].
|    +--- kotlin
|    +--- androidx.compose.animation:animation (*)
|    +--- androidx.compose.animation:animation-core (*)
|    +--- androidx.compose.foundation:foundation-layout (*)
|    +--- androidx.compose.runtime:runtime (*)
|    +--- androidx.compose.runtime:runtime-saveable (*)
|    +--- androidx.compose.ui:ui (*)
|    +--- androidx.compose.ui:ui-geometry (*)
|    +--- androidx.compose.ui:ui-graphics (*)
|    +--- androidx.compose.ui:ui-text (*)
|    +--- androidx.compose.ui:ui-unit (*)
|    +--- androidx.compose.ui:ui-util (*)
|    +--- org.jetbrains.skiko:skiko (*)
|    +--- org.jetbrains.kotlinx:atomicfu (*)
|    \--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)
+--- androidx.compose.foundation:foundation-layout (*)
+--- androidx.compose.runtime:runtime (*)
+--- androidx.compose.runtime:runtime-saveable (*)
+--- androidx.compose.ui:ui (*)
+--- androidx.compose.ui:ui-geometry (*)
+--- androidx.compose.ui:ui-graphics (*)
+--- androidx.compose.ui:ui-text (*)
+--- androidx.compose.ui:ui-unit (*)
+--- androidx.compose.ui:ui-util (*)
+--- org.jetbrains.skiko:skiko (*)
+--- org.jetbrains.kotlinx:atomicfu (*)
\--- org.jetbrains.kotlinx:kotlinx-coroutines-core (*)

(*) - dependencies omitted (listed previously)
```
