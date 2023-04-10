package lesson14_task1

fun main() {

    val ship1 = BaseShip("Неустрашимый", 50, 300, iceBreaker = true)
    val ship2 = BaseShip("Игорь Светлов", 100, 3000)


    ship1.shipSpeed()
    ship1.shipLoadValue()
    println()
    ship2.shipSpeed()
    ship2.shipLoadValue()
    println()
    ship1.iceBreakerStatus()
    ship2.iceBreakerStatus()

}

class BaseShip(
    private val shipName: String,
    private val shipSpeed: Int,
    private val shipLoadCapacity: Int,
    private val iceBreaker: Boolean = false
) {
    fun shipSpeed() {
        println("\"$shipName\" движеться со скоростью $shipSpeed узлов")
    }

    fun shipLoadValue() {
        println("\"$shipName\" перевозит $shipLoadCapacity ящиков груза")
    }

    fun iceBreakerStatus() {
        println("\"$shipName\" - ${if (iceBreaker) "ледокол" else "корабль тёплых широт"}")
    }

}