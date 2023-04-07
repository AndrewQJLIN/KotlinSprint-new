fun main() {

    if (diceRoll("Ход компьютера") <= diceRoll("Ход человека"))  println("Победило человечество")
    else println("Победила машина")
}

fun diceRoll(strRoll:String): Int {
    val diceOne = (1..6).random()
    val diceTwo = (1..6).random()
    println("$strRoll\nВыпали кубики: $diceOne, $diceTwo")
    return diceOne+diceTwo
}