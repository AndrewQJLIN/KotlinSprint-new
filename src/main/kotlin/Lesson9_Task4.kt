fun main() {
    println("Введите пять ингредиетов через заяпятую в одну строку")
    val listIngredient: List<String> = readln().split(',').sorted()
    println(listIngredient)

}