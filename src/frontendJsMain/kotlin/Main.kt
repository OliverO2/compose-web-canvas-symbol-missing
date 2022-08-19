import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("Test") {
            Text("Hello from Compose for Web on Canvas")
        }
    }
}
