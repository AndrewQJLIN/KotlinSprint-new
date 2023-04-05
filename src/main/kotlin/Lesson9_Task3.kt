fun main() {

    val omletIngredient = listOf<String>("Яиц", "Молока", "Сливочного масла")
    val omletMeasure = listOf<String>("шт.", "мл.", "гр")
    val omletCount = listOf<Int>(2, 50, 15)

    println("Какое количество порций омлета надо приготовить? Введи число:")
    val count = readln().toInt()

    println(
        "На $count порций Вам понадобится:\n" +
                "${omletIngredient[0]} - ${omletCount[0] * count} ${omletMeasure[0]}\n" +
                "${omletIngredient[1]} - ${omletCount[1] * count} ${omletMeasure[1]}\n" +
                "${omletIngredient[2]} - ${omletCount[2] * count} ${omletMeasure[2]}\n"
    )


}