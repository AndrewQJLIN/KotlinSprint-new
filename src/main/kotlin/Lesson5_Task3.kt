fun main() {

    val firstNumber = (START_NUMBER..END_NUMBER).random()
    var secondNumber = (START_NUMBER..END_NUMBER).random()
    while (firstNumber == secondNumber) {
        secondNumber = (START_NUMBER..END_NUMBER).random()
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
        var result = if (firstUserNumber == 0 || secondUserNumber == 0) 3 else 0

        if (firstNumber == firstUserNumber || secondNumber == firstUserNumber) {
            result++
        }
        if (firstNumber == secondUserNumber || secondNumber == secondUserNumber) {
            result++
        }

        val outputText = when (result) {
            0 -> "Неудача! Крутите барабан!"
            1 -> {
                firstUserNumber = 0; "Вы выиграли утешительный приз!"
            }

            2 -> {
                firstUserNumber = 0; "Поздравляем! Вы выиграли главный приз!"
            }

            else -> "До свидания!"
        }
        println(outputText)

    } while (firstUserNumber * secondUserNumber != 0)
    println("Игра окончена\nБыли загаданы числа: $firstNumber и $secondNumber")

}

const val START_NUMBER = 1
const val END_NUMBER = 100