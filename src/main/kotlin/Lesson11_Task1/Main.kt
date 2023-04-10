package Lesson11_Task1

fun main() {
    val userOne = User(
        id = 1,
        login = "Andrew",
        password = "qwerty",
        eMail = "andrew_nut@ru.ru"
    )
    val userTwo = User(
        id = 2,
        login = "Nike",
        password = "123456",
        eMail = "loopy@mail.ru"
    )
    println(printData(userOne))
    println(printData(userTwo))
}

fun printData(user:User):String {
    return "ID = ${user.id}, LOGIN = ${user.login}, PASSWORD = ${user.password}, EMAIL = ${user.eMail}"
}
class User (
    val id:Int,
    val login:String,
    val password:String,
    val eMail:String,
)