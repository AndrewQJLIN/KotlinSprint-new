package lessons3

fun main() {
    var strokeNumber = 1

    var startPosLetter = "E"
    var startPosDigit = 2

    var endPosLetter = "E"
    var endPosDigit = 4

    var playersMove = "[$startPosLetter$startPosDigit-$endPosLetter$endPosDigit;$strokeNumber]"
    println(playersMove)

    strokeNumber++

    startPosLetter = "D"
    startPosDigit = 2

    endPosLetter = startPosLetter
    endPosDigit = startPosDigit + 1

    playersMove = "[$startPosLetter$startPosDigit-$endPosLetter$endPosDigit;$strokeNumber]"
    println(playersMove)

}