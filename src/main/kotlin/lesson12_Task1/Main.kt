package lesson12_Task1

fun main() {
    val day1 = WeatherStatus()
    val day2 = WeatherStatus()

    day1.printData()
    day2.printData()

    day1.atmosPressure = 739
    day2.atmosPressure = 790
    day1.tempDay = 23
    day2.tempNight = -5
    day1.rainIsIn = if(day1.rainIsIn == 0 ) 1 else 0
    day2.rainIsIn = if(day2.rainIsIn == 0 ) 1 else 0
    day1.printData()
    day2.printData()
}