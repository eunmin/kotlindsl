
// 멤버 확장 함수

class Column<T>

open class Table {
    fun integer(name: String): Column<Int> = TODO()
    fun varchar(name: String, length: Int): Column<String> = TODO()
    fun Column<Int>.autoIncrement(): Column<Int> = TODO()
    fun <T> Column<T>.primiaryKey(): Column<T> = TODO()
}


object Country: Table() {
    // NO ERROR
    val id = integer("id").autoIncrement().primiaryKey()
    val name = varchar("name", 50)
}

fun main() {
    // ERROR
    Column<Int>().autoIncrement()
}