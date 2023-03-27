package lessons3

fun main() {
    val playerMove = "D2-D4;0"

    val startMoveLetter = "${playerMove[0]}"
    val startMoveDigit = "${playerMove[1]}"
    val endMoveLetter = "${playerMove[3]}"
    val endMoveDigit = "${playerMove[4]}"
    val countMove = "${playerMove[6]}"

    println("Ход игрока номер: $countMove")
    println("Фигура перемещается с клетки: $startMoveLetter$startMoveDigit")
    println("на клетку: $endMoveLetter$endMoveDigit")

}