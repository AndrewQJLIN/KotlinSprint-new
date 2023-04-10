package Lesson11_Task2

fun main() {
    val userOne = User(
        id = 1,
        login = "Andrew",
        password = "qwerty",
        eMail = "andrew_nut@ru.ru"
    )

    userOne.setBio()
    userOne.printUserData()
    userOne.changePassword()
    println("Данные пользователя")
    userOne.printUserData()
    println("Введите сообщение для отправки")
    userOne.sendMessage(readln())

}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = ""
) {
    fun printUserData() {
        println("ID = $id, LOGIN = $login, PASSWORD = $password, EMAIL = $eMail, BIO = $bio")
    }

    fun setBio() {
        println("Введите информацию о себе - раздел BIO")
        bio = readln()
    }

    fun changePassword() {
        do {
            println("Введите старый пароль")
            if (password == readln()) {
                println("Введите новый пароль")
                password = readln()
                println("Пароль изменен")
                break
            } else {
                println("Не верный пароль")
            }
        } while (true)
    }

    fun sendMessage(message: String) {
        println("Сообщение $message\nотправлено на почту $eMail адресату $login")
    }
}