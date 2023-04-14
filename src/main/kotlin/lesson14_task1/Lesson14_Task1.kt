package lesson14_task1

fun main() {

    val ship1 = BaseShip("Неустрашимый", 50, 300, iceBreaker = true)
    val ship2 = BaseShip("Игорь Светлов", 100, 3000)


    ship1.getShipSpeed()
    ship1.printShipLoadValue()
    println()
    ship2.getShipSpeed()
    ship2.printShipLoadValue()
    println()
    ship1.printIceBreakerStatus()
    ship2.printIceBreakerStatus()

}

class BaseShip(
    private val shipName: String,
    private val shipSpeed: Int,
    private val shipLoadCapacity: Int,
    private val iceBreaker: Boolean = false
) {
    fun getShipSpeed() {
        println("\"$shipName\" движеться со скоростью $shipSpeed узлов")
    }

    fun printShipLoadValue() {
        println("\"$shipName\" перевозит $shipLoadCapacity ящиков груза")
    }

    fun printIceBreakerStatus() {
        println("\"$shipName\" - ${if (iceBreaker) "ледокол" else "корабль тёплых широт"}")
    }

}