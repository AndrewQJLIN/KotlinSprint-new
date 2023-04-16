package Lesson18_Task2

fun main() {

    val listDices: List<DiceRoll> = listOf(
        Dice4(),
        Dice6(),
        Dice8(),
        Dice4(),
        Dice6(),
        Dice8(),
        Dice4(),
        Dice6(),
        Dice8(),
    )
    listDices.forEach { it.printNumber() }
}

open class DiceRoll {
    var resultNumber: Int = 0
    open fun printNumber() {
        println("На кубике выпало $resultNumber\n")
    }
}

class Dice4 : DiceRoll() {
    init {
        resultNumber = (1..4).random()
    }

    override fun printNumber() {
        println("Это кубик на 4 грани")
        super.printNumber()
    }
}

class Dice6 : DiceRoll() {
    init {
        resultNumber = (1..6).random()
    }

    override fun printNumber() {
        println("Это кубик на 6 граней")
        super.printNumber()
    }
}

class Dice8 : DiceRoll() {
    init {
        resultNumber = (1..8).random()
    }

    override fun printNumber() {
        println("Это кубик на 8 граней")
        super.printNumber()
    }
}
