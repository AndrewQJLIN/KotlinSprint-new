package lesson4

fun main() {

    var bookingToday = 13
    var bookingTomorrow = 4

    println("Доступность столиков на сегодня:${bookingToday< TOTAL_TABLES} \nДоступность столиков на завтра:${bookingTomorrow< TOTAL_TABLES}")
}

const val TOTAL_TABLES = 13