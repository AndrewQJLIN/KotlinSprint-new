package Lesson20_Task2

fun main() {
    val newPlayer = Player("Nik", 50, 100)
    newPlayer.printStatus()
    newPlayer.potionAccepted()
    newPlayer.printStatus()

}

class Player(
    val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int
) {
    val potionAccepted = fun() = run {
        println("I get potion accepted!")
        currentHealth = maxHealth
    }

    fun printStatus() {
        println(
            """
            NAME - $name
            HEALTH - $currentHealth
        """.trimIndent()
        )
    }
}