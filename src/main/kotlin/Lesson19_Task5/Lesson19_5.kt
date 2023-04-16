package Lesson19_Task5

fun main() {
    val cardHolder = CardHolder()
    println("Вводите имя человека и его пол - 0 - женский, 1 - мужской, иное - не указывать")
    repeat(5) {

        println("Введите имя:")
        val name1 = readln()
        println("Введите пол: 0 - женский, 1 - мужской, другой символ - не указывать")

        cardHolder.addUser(
            User(
                name = name1, when (readln()) {
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
        ПОЛ: ${sex.getSex()}
        
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

enum class Sex(val id: String) {
    FEMALE("0") {
        override fun getSex(): String = "ЖЕНСКИЙ"
    },
    MALE("1") {
        override fun getSex(): String = "МУЖСКОЙ"
    },
    UNDEFINED("") {
        override fun getSex(): String = "ПОЛ НЕ УКАЗАН"
    };

    abstract fun getSex(): String
}