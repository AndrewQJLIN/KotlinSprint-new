package lesson10

fun main() {
    var userLogin = ""
    var userPassword = ""
    println("РЕГИСТРАЦИЯ")

    do {
        println("Введите Ваш ЛОГИН")
        userLogin = readln()
        if (checkString(userLogin)) println("Логин должен быть не более 4-х символов!!!")
        else break
    } while (true)

    userPassword = getPass(4)
    println("Запомните Ваш пароль $userPassword \n")

    println("АВТОРИЗАЦИЯ\nВведите Ваш ЛОГИН и ПАРОЛЬ")

    do {
        if (checkingData("Введите Ваш ЛОГИН", userLogin) &&
            checkingData("Введите Ваш ПАРОЛЬ", userPassword)
        ) break
        else println("Неверные ЛОГИН и/или ПАРОЛЬ. Пробуйте снова")
    } while (true)

    do {
        val codeSMS = (1000..9999).random().toString()
        if (checkingData("Введите Код из СМС $codeSMS", codeSMS)) {
            println("Вы успешно авторизованы")
            break
        } else println("Ошибка!")
    } while (true)

}

fun checkingData(strPrint: String, searchStr: String): Boolean {
    println(strPrint)
    return searchStr == readln()
}

fun checkString(strName: String): Boolean = (strName.length < 4)
fun getPass(passLen: Int): String {
    val rangeDigit = 33..126
    var passOut = ""

    for (i in 1..passLen) {
        passOut += rangeDigit.random().toChar().toString()
    }
    return passOut
}