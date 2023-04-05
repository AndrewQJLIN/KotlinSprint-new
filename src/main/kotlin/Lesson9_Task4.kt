fun main() {
    println("Введите пять ингредиетов через заяпятую в одну строку")
    val listIngredient: List<String> = (readlnOrNull()!!.split(',')).sorted()
    println(listIngredient)

}