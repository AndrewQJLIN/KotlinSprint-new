package lesson12_Task1

import java.time.LocalDate

class WeatherStatus() {
    val dayName = LocalDate.of(2023, 4, (1..30).random())
    var tempDay = (0..30).random()
    var tempNight = (-5..20).random()
    var rainIsIn = (0..1).random()
    var atmosPressure = (730..770).random()

    fun printData () {
        println("""Состояние погоды на ${dayName}:
            |Температура днем: ${tempDay}°С
            |Температура днем: ${tempNight}°С
            |Дождь был: ${if(rainIsIn == 0) "Нет" else "Да" }
            |Атосферное давление: ${atmosPressure} мм.рт.ст 
            |
        """.trimMargin())
    }
}