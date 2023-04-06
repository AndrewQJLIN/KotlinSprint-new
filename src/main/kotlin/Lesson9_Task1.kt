fun main() {

    val receptList = listOf<String>("Помидор", "Огурец", "Майонез", "Руккола", "Специи")

    println("В рецепте есть следующие ингредиеты: $receptList")
    receptList.forEach { println(it) }
}