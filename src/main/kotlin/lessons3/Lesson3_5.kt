package lessons3

fun main() {
    val playerMove = "D2-D4;0"

    val startMove = playerMove.substringBefore('-')
    val endMove = playerMove.substringAfter('-').substringBefore(';')
    val countMove = playerMove.substringAfter(';')

    println("Ход игрока номер: $countMove")
    println("Фигура перемещается с клетки: $startMove")
    println("на клетку: $endMove")

}