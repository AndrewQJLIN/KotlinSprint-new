package lesson10

fun main() {

    println("Введите длину пароля")
    val passOut = getPass(readln().toInt())

    println("Ваш пароль: $passOut")
}

fun getPass(passLen: Int): String {
    val rangeDigit = 0..9
    val rangeSymbolOne = 33..47
    val rangeSymbolTwo = 58..64
    val rangeSymbolThree = 91..96
    val rangeSymbolFour = 123..126
    val rang = rangeSymbolOne + rangeSymbolTwo + rangeSymbolThree + rangeSymbolFour

    var passOut=""

    for (i in 1..passLen) {
        passOut += if (i % 2 == 0)
            rangeDigit.random().toString()
        else
            rang.random().toChar().toString()
    }
    return passOut
}

