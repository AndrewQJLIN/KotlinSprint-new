package lesson12_Task1

import java.time.LocalDate

fun main() {
    val day1 = WeatherStatus()
    val day2 = WeatherStatus()

    day1.printData()
    day2.printData()

    day1.atmosPressure = 739
    day2.atmosPressure = 790
    day1.tempDay = 23
    day2.tempNight = -5
    day1.rainIsIn = if (day1.rainIsIn == 0) 1 else 0
    day2.rainIsIn = if (day2.rainIsIn == 0) 1 else 0
    day1.printData()
    day2.printData()
}

class WeatherStatus() {
    val dayName = LocalDate.of(2023, 4, (1..30).random())
    var tempDay = (0..30).random()
    var tempNight = (-5..20).random()
    var rainIsIn = (0..1).random()
    var atmosPressure = (730..770).random()

    fun printData() {
        println(
            """Состояние погоды на ${dayName}:
            |Температура днем: ${tempDay}°С
            |Температура днем: ${tempNight}°С
            |Дождь был: ${if (rainIsIn == 0) "Нет" else "Да"}
            |Атосферное давление: ${atmosPressure} мм.рт.ст 
            |
        """.trimMargin()
        )
    }
}