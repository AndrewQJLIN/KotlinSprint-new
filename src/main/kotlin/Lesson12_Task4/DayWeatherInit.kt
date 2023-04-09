package Lesson12_Task4
import java.time.LocalDate

class DayWeatherInit(
    val dayName:LocalDate,
    var tempDay:Int,
    var tempNight:Int,
    var rainIsIn:Int = 0,
    var atmosPressure:Int,
)
{

    init {
        this.printData()
    }
         private fun printData () {
            println("""Состояние погоды на ${dayName}:
            |Температура днем: ${tempDay}°С
            |Температура днем: ${tempNight}°С
            |Дождь был: ${if(rainIsIn == 0) "Нет" else "Да"}
            |Атосферное давление: ${atmosPressure} мм.рт.ст
            |
        """.trimMargin())
        }
    }
