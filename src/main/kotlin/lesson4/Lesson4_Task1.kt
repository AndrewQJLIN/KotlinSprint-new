package lesson4

fun main() {

    val bookingToday = 13
    val bookingTomorrow = 4

    println("Доступность столиков на сегодня:${bookingToday < TOTAL_TABLES} \nДоступность столиков на завтра:${bookingTomorrow < TOTAL_TABLES}")
}

const val TOTAL_TABLES = 13