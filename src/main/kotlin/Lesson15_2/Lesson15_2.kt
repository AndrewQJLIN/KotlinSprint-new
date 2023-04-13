package Lesson15_2

fun main() {

    val weatherData = listOf<BaseMessage>(
        TempMessage("│+7│, │+9│, │+6│, │+4│"),
        Fallout("\"дождь со снегом\"")
    )

    weatherData.forEach{
        it.connectToServer()
        it.sendMessage()
    }
}

abstract class BaseMessage()
{
    abstract val message:String
    fun connectToServer() {
        println("Идет подключение к серверу, ждите...")
        repeat(3) {
            println("...")
            Thread.sleep(1000)}
        println("Подключен!")
    }
    abstract fun sendMessage()
}

class TempMessage(override val message: String) : BaseMessage()
{
    override fun sendMessage() {
        println("Данные о температуре ${message} отправлены успешно")
    }
}

class Fallout(override val message: String) : BaseMessage()
{
    override fun sendMessage() {
        println("Данные о количестве осадков ${message} отправлены успешно")
    }
}
