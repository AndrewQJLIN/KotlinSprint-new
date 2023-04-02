package lesson5

fun main() {
    val gameNumbers = intArrayOf(0, 0)

    println(
        "Угадай два числа в диапазоне от $START_NUMBER до $END_NUMBER включительно\n" +
                "Для завершения игры введите - 0 (ноль)"
    )

    do {
        do {
            gameNumbers[0] = (START_NUMBER..END_NUMBER).random()
            gameNumbers[1] = (START_NUMBER..END_NUMBER).random()
        } while (gameNumbers[0] == gameNumbers[1])
        val strAnswer = String.format("%s %d %d", STR_PAIR_NUMBERS_, gameNumbers[0], gameNumbers[1])

        var result = 0

        println("Введите ПЕРВОЕ число - или 0 для выхода")
        var firstUserNumber = readln().toInt()
        if (firstUserNumber == 0) break
        else if (gameNumbers.contains(firstUserNumber)) result++

        println("Введите ВТОРОЕ число")
        if (gameNumbers.contains(readln().toInt())) result++

        val outputText = when (result) {
            1 -> {
                firstUserNumber = 0
                "Вы выиграли утешительный приз!"
            }

            2 -> {
                firstUserNumber = 0
                "Поздравляем! Вы выиграли главный приз!"
            }

            else -> "Неудача! Крутите барабан!"
        }
        println(outputText + strAnswer)

    } while (firstUserNumber != 0)
    println("Игра окончена!")

}

const val START_NUMBER = 1
const val END_NUMBER = 100
const val STR_PAIR_NUMBERS_ = "Были загаданы числа: "