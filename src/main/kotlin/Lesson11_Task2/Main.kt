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