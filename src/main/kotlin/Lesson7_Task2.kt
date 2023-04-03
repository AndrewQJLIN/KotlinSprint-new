fun main() {

    val rangeNumbers = 1000..9999

    do {
        val reciveCode = rangeNumbers.random()
        println("Ваш код авторизации: $reciveCode\n")
        println("Введите, код полученный из СМС")
        if (reciveCode == readln().toInt()) break
        else println("Ошибка...")
    } while (true)

    println("Добро пожаловать")
}