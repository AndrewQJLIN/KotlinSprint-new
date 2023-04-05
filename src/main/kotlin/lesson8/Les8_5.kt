package lesson8

fun main() {
    val receptList = mutableListOf<String>()
    println("Введите число ингредиентов рецепта")
    val countIngredients = readln().toInt()

    for (i in 0 until countIngredients) {
        println("Введите ингредиент №${i + 1}")
        receptList.add(readln())
    }
    println("Ваш список ингредиентов")
}
