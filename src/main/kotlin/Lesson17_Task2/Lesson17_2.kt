package Lesson17_Task2

fun main() {
    val newShip = BattleShip("Неустрашимый", 25, "Мурманск")
    newShip.printShipData()
    println("Введите новое имя корабля")
    newShip.name = readln()
    println()
    newShip.printShipData()
}

class BattleShip(name: String, private val averageSpeed: Int, private val portHome: String) {
    var name: String = name
        set(value) {
            println("Имя корабля нельзя изменить")
        }

    fun printShipData() {
        println(
            """
            ИМЯ: $name
            СРЕДНЯЯ СКРОСТЬ: $averageSpeed
            ПОРТ ПРИПИСКИ: $portHome
        """.trimIndent()
        )
    }
}