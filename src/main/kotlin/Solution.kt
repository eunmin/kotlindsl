import java.lang.AssertionError
import java.lang.StringBuilder
import java.time.Period

/*
// Example1
fun buildString(
        builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

// Example2
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

// Example3
object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) =
            if (!value.startsWith(prefix))
                throw AssertionError("!!!")
            else
                Unit
}

// Example4





// Example5

open class Table {
    fun integer(name: String): Column<Int> = TODO()
    fun varchar(name: String, length: Int): Column<String> = TODO()
    fun <T> Column<T>.primiaryKey(): Column<T> = TODO()
    fun Column<Int>.autoIncrement(): Column<Int> = TODO()
}
*/