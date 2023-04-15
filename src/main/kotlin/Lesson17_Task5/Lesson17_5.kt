package Lesson17_Task5

fun main() {
    val newUser = User("NIK", "123456")
    var status = true
    do {
        println(
            """Что сделать? 
            |1 - Посмотреть ЛОГИН и ПАРОЛЬ
            |2 - Сменить пароль
            |3 - Сменить логин
            |4-  Изменить статус на противоположный
            |0 - выйти
        """.trimMargin()
        )
        when (readln().toInt()) {
            1 -> {
                println("Ваш логин - ${newUser.login} Ваш пароль - ${newUser.password}")
            }

            2 -> {
                println("Введите новый пароль")
                newUser.password = readln()
            }

            3 -> {
                println("Введите новый логин")
                newUser.login = readln()
            }

            4 -> {
                newUser.changeSecurityStatus()
            }

            else -> break
        }
    } while (status)

}

class User(login: String, password: String) {
    private var securityStatus = true
    private var hidePassword: String = ""

    init {
        hidePassword = printStar(password)
        securityStatus = false
    }

    var login: String = login
        set(value) {
            println("Логин изменен")
            field = value
        }

    var password: String = password
        get() = if (securityStatus) field else hidePassword
        set(value) {
            if (securityStatus) {
                field = value
                hidePassword = printStar(value)
            } else
                println("Вы не можете изменить пароль. Доступ запрещен!\n")
        }

    private fun printStar(string1: String): String {
        var string = ""
        string1.forEach { _ -> string += "*" }
        return string
    }

    fun changeSecurityStatus() {
        securityStatus = !securityStatus
        println("Статус доступа изменен на ${if (securityStatus) "РАЗРЕШЕН" else "ЗАКРЫТ"}")
    }
}