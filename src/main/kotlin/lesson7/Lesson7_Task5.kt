package lesson7

fun main() {

    val rangeDigit = 0..9
    val rangeSymbolDown = 'a'..'z'
    val rangeSymbolUp = 'A'..'Z'
    var stringPassword = ""

    println("Введите длину пароля")
    val passLen = readln().toInt()

    for (i in 0 until passLen) {
        stringPassword += when ((0..2).random()) {
            0 -> rangeDigit.random().toString()
            1 -> rangeSymbolDown.random().toString()
            else -> rangeSymbolUp.random().toString()
        }
    }

    println(stringPassword)
}