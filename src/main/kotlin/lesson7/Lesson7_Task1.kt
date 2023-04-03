package lesson7

fun main() {
    val rangeDigit = 0..9
    val rangeSymbol = 'a'..'z'

    val passOne = rangeSymbol.random()
    val passTwo = rangeDigit.random()
    val passThree = rangeSymbol.random()
    val passFour = rangeDigit.random()
    val passFive = rangeSymbol.random()
    val passSix = rangeDigit.random()

    println(String.format("Password: %s%d%s%d%s%d", passOne, passTwo, passThree, passFour, passFive, passSix))

}