package Lesson11_Task2


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

    fun sendMessage(message:String) {
        println("Сообщение $message\nотправлено на почту $eMail адресату $login")
    }
}