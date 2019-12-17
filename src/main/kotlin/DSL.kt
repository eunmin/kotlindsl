
import kotlinx.html.*
import kotlinx.html.stream.createHTML


fun main() {
    val myDiv = createHTML(). table {
        tr {
            td { +"cell" }
        }
    }

    // vs

    val myDiv2 = "<table><tr><td>cell<td></tr></table>"


    val s = "selec * from user"

    val s2 = select() { from "user" }
}