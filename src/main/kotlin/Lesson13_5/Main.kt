package Lesson13_5

fun main() {
    val number: Long
    val strNumber = readLine().toString()
    try {
        println("Ваши цифры - ${strNumber.toLong()}")
    }
    catch (e: NumberFormatException) {
          println("В номере должны быть только цифры, а не это $strNumber")
    }
    finally {
        println("Мы закончили")
    }

}