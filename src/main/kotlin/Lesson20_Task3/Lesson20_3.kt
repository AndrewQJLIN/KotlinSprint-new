package Lesson20_Task3

fun main() {
    val newPlayer = Player()
    newPlayer.tryOpenDoor()
    newPlayer.hasKey=false
    newPlayer.tryOpenDoor()
}

class Player() {
   var hasKey:Boolean = true

    val tryOpenDoor = fun() = run { if (hasKey) println("Дверь открыта") else println("Нет ключа! дверь не открыть") }
}
