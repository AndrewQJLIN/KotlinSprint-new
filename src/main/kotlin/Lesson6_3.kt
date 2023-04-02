fun main() {
    println("Введите количество секунд которые надо засечь:")
    var timeDelay = readln().toInt()
    println("Стартую...")

    while (timeDelay > 0) {
        println("Осталось секунд: ${timeDelay--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}