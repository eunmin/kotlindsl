
// invoke 관례

class Greeter(val name: String) {
    operator fun invoke(prefix: String) {
        //ssss
    }
}

fun example2() {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")
}

fun main() {
    example2()
}