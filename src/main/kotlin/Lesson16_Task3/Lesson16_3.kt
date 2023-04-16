package Lesson16_Task3

fun main() {
    val newUser = User("NIK")

    println("Ваш логин  - ${newUser.login}")
    println("Введите Ваш пароль ")
    println(if (newUser.checkPassword(readln())) "Вы авторизованы!" else "Не верный пароль!")
}

class User(val login: String) {
    private var password: String = ""
    init {
        println("Привет $login введи свой пароль")
        password = readln()
    }
    fun checkPassword(pass: String): Boolean = pass == password
}