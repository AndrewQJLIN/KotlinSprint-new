package Lesson12_Task4

import java.time.LocalDate

fun main() {
    val daysWeather = mutableListOf<DayWeatherInit>()

    for (i in 0..5) {
        daysWeather += DayWeatherInit(
            dayName = LocalDate.of(2023, 4, (1..30).random()),
            tempDay = (0..30).random(),
            tempNight = (-5..20).random(),
            atmosPressure = (730..770).random()
        )
    }
}