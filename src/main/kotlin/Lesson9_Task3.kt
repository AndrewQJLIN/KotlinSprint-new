fun main() {

    val omletIngredient = listOf<String>("Яиц", "Молока", "Сливочного масла")
    val omletMeasure = listOf<String>("шт.", "мл.", "гр")
    val omletCount = listOf<Int>(2, 50, 15)


    println("Какое количество порций омлета надо приготовить? Введи число:")
    val count = readln().toInt()

    println("На $count порций Вам понадобится:")
    for(i in omletIngredient.indices) {
        println("${omletIngredient[i]} - ${omletCount[i] * count} ${omletMeasure[i]}")
    }

}