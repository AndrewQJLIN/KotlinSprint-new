package Lesson12_Task3

import java.time.LocalDate


fun main() {
    val daysWeather = mutableListOf<DayWeather>()

    for (i in 0..5) {
        daysWeather += DayWeather(
            dayName = LocalDate.of(2023, 4, (1..30).random()),
            tempDay = (0..30).random(),
            tempNight = (-5..20).random(),
            atmosPressure = (730..770).random()
        )
    }
    daysWeather.forEach { it.printData() }
}

class DayWeather(
    val dayName: LocalDate,
    var tempDay: Int,
    var tempNight: Int,
    var rainIsIn: Int = 0,
    var atmosPressure: Int,
) {
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