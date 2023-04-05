package lesson8

fun main() {
    val receptOne = arrayOf("рис", "лук", "морковь", "масло", "соль", "мясо")
    println("Список ингредиентов")
    println(receptOne.contentToString())
    var searchItem = ""
    var indexChange = -1

    do {
        println("Введите ингердиент, который надо заменить")
        searchItem = readln()
        if (!receptOne.contains(searchItem)) println("Такого ингредиента в списке нет! Попробуйте снова")
        else indexChange = receptOne.indexOf(searchItem)
    } while (indexChange == -1)

    println("Введите название нового ингредиента")
    receptOne[indexChange] = readln()
    println("Готово! Вы сохранили следующий список: ${receptOne.contentToString()}")
    // receptOne.forEach {println(it)}

}