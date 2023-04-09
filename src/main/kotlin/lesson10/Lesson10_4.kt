package lesson10

fun main() {

    var humanWin = roundGame()

    do {
        println("Хотите бросить кости еще раз Введите Да или Нет")
        if (readln() == "Нет") {
            println("Человечество победило $humanWin раз")
            break
        }
        humanWin += roundGame()
    } while (true)
}

//fun diceRoll(strRoll: String): Int {
//    val diceOne = (1..6).random()
//    val diceTwo = (1..6).random()
//    println("$strRoll\nВыпали кубики: $diceOne, $diceTwo")
//    return diceOne + diceTwo
//}

fun roundGame(): Int {
    return if (diceRoll("Ход компьютера") <= diceRoll("Ход человека")) {
        println("Победило человечество")
        1
    } else {
        println("Победила машина")
        0
    }
}