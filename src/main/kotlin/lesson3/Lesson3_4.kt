package lesson3

fun main() {
    var strokeNumber = 1

    var startPos = "E2"

    var endPos = "E4"

    var playersMove = "[$startPos-$endPos;$strokeNumber]"
    println(playersMove)

    strokeNumber++
    startPos = "D2"
    endPos = "D3"

    playersMove = "[$startPos-$endPos;$strokeNumber]"
    println(playersMove)
}