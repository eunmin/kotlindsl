
// 수신 객체 지정 람다

fun buildString(f: StringBuilder.() -> Unit): String {
    val sb = java.lang.StringBuilder()
    sb.f()
    return sb.toString()
}


fun example1() {

    val s = table {
        tr("a")
    }

//    val x = StringBuilder().append("a").append("b")
//
//    val y = buildString {
//        append("a")
//        append("b")
//    }

    println(x)
    println(y)
}

fun main() {
    example1()
}