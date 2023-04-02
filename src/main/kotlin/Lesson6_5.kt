fun main() {

    println("Проверяем, что Вы не бот\n")
    var outputText = "Доступ запрещен!"
    var attemptCount = 3

    do {
        val digitOne: Int = (1..9).random()
        val digitTwo: Int = (1..9).random()
        val correctAnswer = digitOne + digitTwo

        println("Решите пример и напишите ответ: $digitOne + $digitTwo = ")
        if (correctAnswer == readln().toInt()) {
            outputText = "Добро пожаловать!"
            break
        } else {
            println("Неверно")
        }

    } while (--attemptCount > 0)
    println(outputText)
}