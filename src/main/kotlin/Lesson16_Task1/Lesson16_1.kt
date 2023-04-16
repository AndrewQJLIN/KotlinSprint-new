package Lesson16_Task1

fun main() {
    val diceRoll1 = DiceRoll()
    diceRoll1.getSideDiceRoll()
}

class DiceRoll {
    private val sideDiceRoll: Int = (1..6).random()
    fun getSideDiceRoll() {
        println("На кубике выпало $sideDiceRoll")
    }
}