package lesson8

fun main() {
    val receptOne = arrayOf("рис", "лук", "морковь", "масло", "соль", "мясо")
    println("Введите искомый ингредиент")

    if (receptOne.contains(readln())) println("Этот ингредиент в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}