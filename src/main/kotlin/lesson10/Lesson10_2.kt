package lesson10

fun main() {
    println("Enter your LOGIN")
    val userLogin = readln()
    println("Enter your PASSWORD")
    val userPassword = readln()

    if(checkString(userLogin) || checkString(userPassword))
        println("Логин или пароль недостаточно длинные")

}

fun checkString(strName: String): Boolean = (strName.length < 4)