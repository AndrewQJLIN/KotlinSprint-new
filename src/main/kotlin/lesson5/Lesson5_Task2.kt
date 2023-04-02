package lesson5

import java.time.LocalDate

fun main() {

    println("Введите год Вашего рождения:")
    val usersYear = readln().toInt()
    val currentYear = LocalDate.now().year

    val resultText = if ((currentYear - usersYear) > AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Доступ запрещен - нет полных 18 лет"
    println(resultText)
}

const val AGE_OF_MAJORITY = 18