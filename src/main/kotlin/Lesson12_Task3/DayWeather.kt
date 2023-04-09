package Lesson12_Task3

import java.time.LocalDate

class DayWeather (
    val dayName:LocalDate,
    var tempDay:Int,
    var tempNight:Int,
    var rainIsIn:Int = 0,
    var atmosPressure:Int,
)
{
    fun printData () {
        println("""Состояние погоды на ${dayName}:
            |Температура днем: ${tempDay}°С
            |Температура днем: ${tempNight}°С
            |Дождь был: ${if(rainIsIn == 0) "Нет" else "Да"}
            |Атосферное давление: ${atmosPressure} мм.рт.ст
            |
        """.trimMargin())
    }
}