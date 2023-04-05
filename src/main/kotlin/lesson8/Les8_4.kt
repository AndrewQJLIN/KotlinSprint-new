package lesson8

fun main() {
    val receptOne = arrayOf("рис", "лук", "морковь", "масло", "соль", "мясо")
    println("Список ингредиентов")
    println(receptOne.contentToString())
    var indexChange = -1

    do {
        println("Введите ингердиент, который надо заменить")
        indexChange = receptOne.indexOf(readln())

        if (indexChange == -1) println("Такого ингредиента в списке нет! Попробуйте снова")
        else break
    } while (true)

    println("Введите название нового ингредиента")
    receptOne[indexChange] = readln()
    println("Готово! Вы сохранили следующий список: ${receptOne.contentToString()}")


}