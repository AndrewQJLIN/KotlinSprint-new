fun main() {

    val firstNumber = (START_NUMBER..END_NUMBER).random()
    var secondNumber = (START_NUMBER..END_NUMBER).random()
    while (firstNumber == secondNumber) {
        secondNumber = (1..100).random()
    }

    println(
        "Угадай два числа в диапазоне от ${START_NUMBER} до ${END_NUMBER} включительно\n" +
                "Для завершения игры введите и/или первое или второе число  - 0 (ноль)"
    )

    do {
        println("Введите ПЕРВОЕ число")
        var firstUserNumber = readln().toInt()
        println("Введите ВТОРОЕ число")
        val secondUserNumber = readln().toInt()
        var result = 0
        if (firstNumber == firstUserNumber || secondNumber == firstUserNumber) {
            result++
        }
        if (firstNumber == secondUserNumber || secondNumber == secondUserNumber) {
            result++
        }

        val outputText = when (result) {
            0 -> "До свидания!"
            1 -> {
                firstUserNumber = 0; "Вы выиграли утешительный приз!"
            }

            2 -> {
                firstUserNumber = 0; "Поздравляем! Вы выиграли главный приз!"
            }

            else -> "Неудача! Крутите барабан!"
        }
        println(outputText)

    } while (firstUserNumber * secondUserNumber != 0)
    println("Игра окончена\nБыли загаданы числа: $firstNumber и $secondNumber")

}

const val START_NUMBER = 1
const val END_NUMBER = 100