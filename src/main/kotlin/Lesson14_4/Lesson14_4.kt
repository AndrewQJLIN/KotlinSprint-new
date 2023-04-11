package Lesson14_4

fun main() {

    val sputnik1 = Sputnik(name = "BOROS")
    val sputnik2 = Sputnik(name = "CRIO")
    val sputnik3 = Sputnik(name = "YUOPA")

    val planet1 = Planet(
        name = "RADUGA", sputnik = listOf(sputnik1, sputnik2, sputnik3), athmosStatus = true,
        waterPresent = true
    )
    planet1.printPlanetInfo()
}

open class CosmosBody(
    val athmosStatus: Boolean = false,
    val liveStatus: Boolean = false,
    val waterPresent: Boolean = false,
    val takeOffStatus: Boolean = false,
    open val name: String
) {

    open fun printPlanetInfo() {
        println(
            """
            Атмосфера: ${if (athmosStatus) "есть" else "нет"}
            Жизнь: ${if (liveStatus) "присутствует" else "нет"}
            Вода: ${if (waterPresent) "есть" else "нет"}
            Высадка: ${if (takeOffStatus) "возможна" else "не возможна"}
        """.trimIndent()
        )
    }
}

class Planet(
    name: String,
    athmosStatus: Boolean = false,
    liveStatus: Boolean = false,
    waterPresent: Boolean = false,
    takeOffStatus: Boolean = false,
    val sputnik: List<Sputnik>
) : CosmosBody(
    name = name,
    athmosStatus = athmosStatus,
    liveStatus = liveStatus,
    waterPresent = waterPresent,
    takeOffStatus = takeOffStatus
) {
    override fun printPlanetInfo() {
        println("ПЛАНЕТА - $name")
        super.printPlanetInfo()
        print("СПУТНИКИ: ")
        sputnik.forEach { it -> print("${it.name} ") }
    }
}

class Sputnik(
    name: String,
) : CosmosBody(name = name)
