fun main() {
    println("Угадай число от $START_NUMBER до $END_NUMBER c ПЯТИ попыток")

    val searchNumber = (START_NUMBER..END_NUMBER).random()
    var attemptCount = ATTEMPT_COUNT

    do {
        println("Попытка номер $attemptCount. Введите число:")
        if (searchNumber == readln().toInt()) {
            println("Это была великолепная игра!")
            break
        }
    } while (--attemptCount > 0)

    if (attemptCount == 0) println("НЕ УГАДАЛИ. Было загадано число $searchNumber")

}

const val START_NUMBER = 1
const val END_NUMBER = 9
const val ATTEMPT_COUNT = 5