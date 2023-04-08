import java.util.*
import java.util.Locale.*

fun main() {

    val listIngredient = mutableSetOf<String>()
    println("Введите 5 уникальных (неповторяющихся) ингредиентов по-строчно")

    var indexListIngredient = 0

    do {
        val newIngredient = readln()
        if (listIngredient.add(newIngredient)) {
            indexListIngredient++
        }
        else {
            println("Такой ингердиент - $newIngredient уже есть в списке.Введите новый")
        }

    } while (indexListIngredient < 5)

    val finishListIngredient = listIngredient.sorted().toMutableList()
    finishListIngredient[0] =
        finishListIngredient[0].replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() }
    finishListIngredient[finishListIngredient.size-1] += "."
    println(finishListIngredient)


}