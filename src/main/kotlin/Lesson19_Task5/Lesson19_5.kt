package Lesson19_Task5

fun main() {
    val cardHolder = CardHolder()
    println("Вводите имя человека и его пол - 0 - женский, 1 - мужской, иное - не указывать")
    repeat(5) {

        println("Введите имя:")
        val inputName = readln()
        println("Введите пол: 0 - женский, 1 - мужской, другой символ - не указывать")

        cardHolder.addUser(
            User(
                name = inputName, when (readln()) {
                    Sex.FEMALE.id -> Sex.FEMALE
                    Sex.MALE.id -> Sex.MALE
                    else -> Sex.UNDEFINED
                }
            )
        )
    }
    cardHolder.printAllUsers()
}

class User(private val name: String, private val sex: Sex) {
    fun getUser(): String = """
        ИМЯ: $name
        ПОЛ: ${sex.sex}
        
    """.trimIndent()
}

class CardHolder() {
    private val listUser: MutableList<User> = mutableListOf()

    fun addUser(user: User) {
        listUser += user
    }

    fun printAllUsers() {
        listUser.forEach {
            println(it.getUser())
        }
    }
}

enum class Sex(val id: String, val sex: String) {
    FEMALE("0", "ЖЕНСКИЙ"),
    MALE("1", "МУЖСКОЙ"),
    UNDEFINED("", "ПОЛ НЕ УКАЗАН");
}