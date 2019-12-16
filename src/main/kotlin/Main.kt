import kotlinx.html.*
import kotlinx.html.stream.createHTML
import java.lang.StringBuilder

fun buildString(
        builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main() {
    val myDiv = createHTML(). table {
        tr {
            td { +"cell" }
        }
    }

    println(myDiv)

    val s = buildString {
        append("Hello, ")
        append("World!")
    }

    println(s)

    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")
}