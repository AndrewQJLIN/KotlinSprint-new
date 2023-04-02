fun main() {

    println("Введите количество секунд которые надо засечь:")
    var timeDelay = readln().toInt()
    val outPutStr = String.format("%s %d %s", "Прошло", timeDelay, "секунд")

    println("Стартую...")

    while (timeDelay > 0) {
        Thread.sleep(1000)
        timeDelay--
    }
    println(outPutStr)
}