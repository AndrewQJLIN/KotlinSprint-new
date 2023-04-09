package Lesson12_Task5

import java.time.LocalDate

fun main() {
    val daysWeather = mutableListOf<DayWeatherCalc>()

    var averageDayTemp = 0
    var averageNightTemp = 0
    var averageAtmosPressure = 0
    var countRainDays = 0

    for (i in 1..10) {
        daysWeather += DayWeatherCalc(
            dayName = LocalDate.of(2023, 4, (1..30).random()),
            tempDay = (0..30).random(),
            tempNight = (-5..20).random(),
            atmosPressure = (730..770).random(),
            rainIsIn = (0..1).random()
        )
    }

    daysWeather.forEach { countRainDays +=it.rainIsIn
        averageDayTemp += it.tempDay
        averageNightTemp += it.tempNight
        averageAtmosPressure += it.atmosPressure
    }
val countDays = daysWeather.size

    println(
        """Средние значения за период :
            |Температура днем: ${averageDayTemp/countDays}°С
            |Температура ночью: ${averageNightTemp/countDays}°С
            |Атосферное давление: ${averageAtmosPressure/countDays} мм.рт.ст
            |Количество дождливых дней: $countRainDays"
            |
        """.trimMargin()
    )
}