package lesson7

fun main() {

    val rangeNumbers = 1000..9999

    do {
        val reciveCode = rangeNumbers.random()
        println("Ваш код авторизации: $reciveCode")
        println("Введите, код полученный из СМС")

    } while (reciveCode != readln().toInt())

    println("Добро пожаловать")
}