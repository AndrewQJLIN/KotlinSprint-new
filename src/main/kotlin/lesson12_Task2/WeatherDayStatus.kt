package lesson12_Task2

import java.time.LocalDate

class WeatherDayStatus(_data: LocalDate, _tDay: Int, _tNight:Int, _rain: Int, _atmos: Int) {
    private val dayName = _data
    private var tempDay = _tDay
    private var tempNight = _tNight
    private var rainIsIn = _rain
    private var atmosPressure = _atmos

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