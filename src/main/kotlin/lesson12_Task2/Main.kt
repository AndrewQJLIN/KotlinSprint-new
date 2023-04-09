package lesson12_Task2

import java.time.LocalDate

fun main() {

    val daysWeather = mutableListOf<WeatherDayStatus>()

    for (i in 0..2) {
        daysWeather += WeatherDayStatus(
            LocalDate.of(2023, 4, (1..30).random()),
            (0..30).random(),
            (-5..20).random(),
            (0..1).random(),
            (730..770).random()
        )
    }
    daysWeather.forEach { it.printData() }
}