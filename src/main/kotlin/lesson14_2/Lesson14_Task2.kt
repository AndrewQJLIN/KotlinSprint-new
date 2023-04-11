package lesson14_2


fun main() {

    val ship1 = IcebreakerShip("Неустрашимый", 50, 300, 1998, 2.4f, 180)
    val ship2 = CargoShip("Игорь Светлов", 100, 3000, 2003, 150, 5000)

    ship1.shipDescription()
    println()
    ship2.shipDescription()
    println()
    ship1.shipSpeed()
    ship2.shipSpeed()
    println()
    ship1.startScoutDrone()
    ship2.goToPort("СОЧИ")

}

open class BaseShip(
    val shipName: String,
    val shipSpeed: Int,
    val shipLoadCapacity: Int,
    val dateIssue: Int,
) {
    fun shipSpeed() {
        println("\"$shipName\" движеться со скоростью $shipSpeed узлов")
    }


    open fun shipDescription() {
        println(
            """
            Название судна: "$shipName"
            Максимальная скорость: $shipSpeed узлов
            Объем загрузки контейнеров: $shipLoadCapacity
            Год выпуска: $dateIssue
        """.trimIndent()
        )
    }
}

class IcebreakerShip(
    shipName: String, shipSpeed: Int, shipLoadCapacity: Int, dateIssue: Int,
    val maxIceSize: Float,
    val maxDaysNavigation: Int,
) : BaseShip(shipName, shipSpeed, shipLoadCapacity, dateIssue) {
    fun startScoutDrone() {
        println("Ледокол $shipName запустил дроны-разведчики")
    }


    override fun shipDescription() {
        super.shipDescription()
        println(
            """
            Тип судна: ЛЕДОКОЛ
            MAX толщина льда: $maxIceSize метр.
            MAX дней навигации: $maxDaysNavigation
        """.trimIndent()
        )
    }
}

class CargoShip(
    shipName: String, shipSpeed: Int, shipLoadCapacity: Int, dateIssue: Int,
    val maxCountConteiners: Int,
    val maxDistance: Int,
) : BaseShip(shipName, shipSpeed, shipLoadCapacity, dateIssue) {


    fun goToPort(port: String) {
        println("Грузовой корабль $shipName взял курс на порт $port")
    }

    override fun shipDescription() {
        super.shipDescription()
        println(
            """
            Тип судна: ГРУЗОВОЙ
            MAX число контейнеров: $maxCountConteiners шт.
            MAX длина пути: $maxDistance миль
        """.trimIndent()
        )
    }
}