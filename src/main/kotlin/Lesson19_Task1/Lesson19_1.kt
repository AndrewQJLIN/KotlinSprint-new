package Lesson19_Task1

fun main() {
    println("Вы можете добавить в аквариум следующих рыб")
    for (i in AquaFish.values())
        println(i)
}

enum class AquaFish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}