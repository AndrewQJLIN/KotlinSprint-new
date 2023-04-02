package lesson5

fun main() {
    val digitOne: Int = (0..10).random()
    val digitTwo: Int = (0..10).random()
    val correctAnswer = digitOne + digitTwo

    println("Решите пример и напишите ответ: $digitOne + $digitTwo = ")
    val outputText = if (correctAnswer == readln().toInt()) "Добро пожаловать!" else "Доступ запрещен!"

    println(outputText)
}