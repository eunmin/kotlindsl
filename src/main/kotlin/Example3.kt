
// 중위 호출
object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) =
            if (!value.startsWith(prefix))
                throw AssertionError("!!!")
            else
                Unit
}

fun example3() {
    println("kotlin" should start with "k")
    println("kotlin".should(start).with("k"))
}

fun main() {
    example3()
}