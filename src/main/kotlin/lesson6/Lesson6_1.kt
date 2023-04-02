package lesson6

fun main() {

    println("Пожалуйста, зарегистрируйтесь:")
    println("Придумайте и введите Ваш LOGIN")
    val userLogin = readln()
    println("Придумайте и введите Ваш ПАРОЛЬ")
    val userPassword = readln()

    do {
        println("Пожалуйста, введите ЛОГИН и ПАРОЛЬ для входа\n--- Введите Ваш LOGIN:")
        val loginCheckIn = userLogin == readln()
        println("--- Введите Ваш ПАРОЛЬ:")
        if (userPassword == readln() && loginCheckIn) {
                println("Авторизация прошла успешно")
                break
            }
        println("Неверные логин/пароль, попробуйте снова\n")
    } while (true)
}