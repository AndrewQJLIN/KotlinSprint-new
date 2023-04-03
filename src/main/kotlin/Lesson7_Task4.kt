fun main() {

    println("Введите число секунд таймера")
    val timerTime = readln().toInt()

    for (i in timerTime downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}