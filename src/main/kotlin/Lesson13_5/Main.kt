package Lesson13_5

fun main() {
    val strNumber = readln()
    try {
        println("Ваши цифры - ${strNumber.toLong()}")
    } catch (e: NumberFormatException) {
        println("В номере должны быть только цифры, а не это $strNumber")
    } finally {
        println("Мы закончили")
    }
}