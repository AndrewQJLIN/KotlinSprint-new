package Lesson20_Task5

import java.lang.reflect.Modifier

fun main() {
    val strTexts: List<String> = listOf(
        "Привет! я Робот",
        "Я умею писаьт и читать",
        "Привет мир! я Робот переводчик",
        "Ландэн из зэ кэпитал ов грейт британ",
        "как прекрасен этот мир - посмотри"
    )
    val robot = Robot()
    val inverterModifier: (String) -> Unit = fun(str: String) { println("ИНВЕРТИРУЮ: ${str.reversed()}") }

    strTexts.forEach {
        robot.say(it)
        robot.setModifier(it, inverterModifier)
        println()
    }
}

class Robot {
    fun say(text: String) {
        println("Robot говорит: $text")
    }

    fun setModifier(input: String, modifier: (String) -> Unit) {
        modifier(input)
    }
}
