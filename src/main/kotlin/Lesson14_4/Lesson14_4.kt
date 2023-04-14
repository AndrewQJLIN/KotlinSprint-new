package Lesson14_4

fun main() {

    val sputnik1 = Sputnik(name = "BOROS")
    val sputnik2 = Sputnik(name = "CRIO")
    val sputnik3 = Sputnik(name = "YUOPA")

    val planet1 = Planet(
        name = "RADUGA", sputnik = listOf(sputnik1, sputnik2, sputnik3), athmosStatus = true,
        waterPresent = true, liveStatus = false, takeOffStatus = true
    )
    planet1.printPlanetInfo()
    println()
    sputnik1.printPlanetInfo()
}

open class CosmosBody(
    val athmosStatus: Boolean = false,
    val liveStatus: Boolean = false,
    val waterPresent: Boolean = false,
    val takeOffStatus: Boolean = false,
    val name: String
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
    athmosStatus: Boolean,
    liveStatus: Boolean,
    waterPresent: Boolean,
    takeOffStatus: Boolean,
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
