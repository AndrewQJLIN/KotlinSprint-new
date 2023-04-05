fun main() {

    val receptBase = mutableListOf<String>("Помидор", "Огурец", "Салат")

    println("В рецепте есть базовые ингредиенты: $receptBase\nЖелаете добавить свой - да/нет?")

    if(readln() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        receptBase.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $receptBase")
    }

}