import Lesson11_Task3.Account
import Lesson11_Task3.Lenta
import Lesson11_Task3.Room

fun main() {
    val newLenta = Lenta()
    val user1 = Account("ГРИФ", badge = "я босс", status = "разговаривает")
    val user2 = Account("КОТ", badge = "готов!", status = "микрофон выключен")
    val user3 = Account("НИК", badge = "худею", status = "разговаривает")
    val user4 = Account("СЕРГЕЙ", badge = "ищу", status = "пользователь заглушен")
    val user5 = Account("ФОТО1", badge = "ладно", status = "разговаривает")
    val user6 = Account("МЕС", badge = "всегда", status = "микрофон выключен")
    val user7 = Account("ИРА", badge = "юрасик", status = "пользователь заглушен")

    val greenRoom = Room("GREEN", "Зеленая комната")
    greenRoom.listAccount.add(user1)
    greenRoom.listAccount.add(user4)
    greenRoom.listAccount.add(user3)

    val redRoom = Room(
        "RED", "Красная комната",
        listAccount = mutableListOf(user5, user7, user3)
    )

    val whiteRoom = Room(
        "WHITE", "Белая комната",
        mutableListOf(user2, user6)
    )

    newLenta.listRooms = mutableListOf(greenRoom, redRoom, whiteRoom)
}