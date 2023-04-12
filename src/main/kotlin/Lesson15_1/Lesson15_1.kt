package Lesson15_1

fun main() {
    val creatuserList = listOf<Creature>(
        Carp("КЕША"),
        Seagull("ЗОЯ"),
        Duck("ДОНАЛЬД")
    )
    creatuserList.forEach { it.whatIsName() }
}


abstract class Creature() {
    abstract val name: String
    open fun whatIsName() {
        println("Меня зовут $name")
    }
}

class Carp(override val name: String) : Creature(), Swimable {

    override fun whatIsName() {
        println("\nЯ - КАРАСЬ!")
        super.whatIsName()
        super.swiming()
    }
}

class Seagull(override val name: String) : Creature(), Flyable {

    override fun whatIsName() {
        println("\nЯ - ЧАЙКА!")
        super.whatIsName()
        super.flying()
    }
}

class Duck(override val name: String) : Creature(), Swimable, Flyable {

    override fun whatIsName() {
        println("\nЯ - УТКА!")
        super.whatIsName()
        super.swiming()
        super.flying()
    }
}

interface Swimable {
    fun swiming() {
        println("Я могу плавать!")
    }
}


interface Flyable {
    fun flying() {
        println("Я могу летать!")
    }
}
