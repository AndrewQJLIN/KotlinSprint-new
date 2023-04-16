package Lesson19_Task2

fun main() {
    val listGood: List<Good> = listOf(
        Good("Носки", 565, Category.CLOTHES),
        Good("Майка", 1565, Category.CLOTHES),
        Good("Ножницы", 565, Category.KANCELATORY),
        Good("Карандаш", 5765, Category.KANCELATORY),
        Good("Тетрадь", 3565, Category.KANCELATORY),
        Good("Мука", 5645, Category.OTHERS),
        Good("Игра", 5695, Category.OTHERS),
        Good("Телефон", 5065, Category.OTHERS),
    )
    listGood.forEach { it.printGoodInfo() }

}

class Good(
    private val name: String,
    private val id: Int,
    private val category: Category
) {
    fun printGoodInfo() {
        println(
            """
            Название товара: $name
            Артикул: $id
            ${category.printCategory()}
            
        """.trimIndent()
        )
    }
}

enum class Category() {
    CLOTHES {
        override fun printCategory(): String = "Категория: ОДЕЖДА"
    },
    KANCELATORY {
        override fun printCategory(): String = "Категория: КАНЦЕЛЯРСКИЕ ТОВАРЫ"
    },
    OTHERS {
        override fun printCategory(): String = "Категория: РАЗНОЕ"
    };

    abstract fun printCategory(): String

}
