package Lesson18_Task2

fun main() {

    val listDices: List<Dice> = listOf(
        Dice(4),
        Dice(6),
        Dice(8)
    )
    listDices.forEach { it.printNumber() }
}

abstract class DiceRoll(val countEdge: Int) {
    var resultNumber: Int = 0
    open fun printNumber() {
        println("На кубике выпало $resultNumber\n")
    }
}

class Dice(count: Int) : DiceRoll(countEdge = count) {
    init {
        resultNumber = (1..countEdge).random()
    }

    override fun printNumber() {
        println("Это кубик из $countEdge граней")
        super.printNumber()
    }
}
