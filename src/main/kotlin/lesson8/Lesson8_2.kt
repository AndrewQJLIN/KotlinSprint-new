package lesson8

fun main() {
    val receptOne = arrayOf("рис", "лук", "морковь", "масло", "соль", "мясо")

    println("Введите искомый ингредиент")
    val searchItem = readln()
    if (receptOne.contains(searchItem)) println("Ингредиент $searchItem в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}