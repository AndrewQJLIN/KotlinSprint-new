package lesson2

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTime:Int = 457

    var endHour = startHour + travelTime/60
    var endMinute = startMinute + travelTime%60

    if(endMinute>60) {
        endHour++
        endMinute -=60
    }

    println("Отправление: $startHour:$startMinute")
    println("Прибытие   : $endHour:$endMinute")
}