import java.util.*
import java.util.Locale.*

fun main() {

    val listIngredient = mutableListOf<String>("", "", "", "", "")
    println("Введите 5 уникальных (неповторяющихся) ингредиентов по-строчно")

    var indexListIngredient = 0

    do {
        val newIngredient = readln()
        if (!listIngredient.contains(newIngredient)) {
            listIngredient[indexListIngredient++] = newIngredient
        } else {
            println("Такой ингердиент - $newIngredient уже есть в списке.Введите новый")
        }
    } while (indexListIngredient < 5)
    val finishListIngredient = listIngredient.sorted()

    val lastIndex = finishListIngredient.size - 1

    print("${finishListIngredient[0].replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() }}, ")

    for (i in 1 until lastIndex)
        print("${finishListIngredient[i]}, ")

    println("${finishListIngredient[lastIndex]}.")
}