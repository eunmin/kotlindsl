
// 기본 타입 확장

val Int.days: Period
    get() = Period.ofDays(this)

fun example4() {
    println(1.days)
}

fun main() {
    example4()
}