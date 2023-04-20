package Lesson20_Task5

import java.lang.reflect.Modifier

fun main() {

    val robot = Robot()
    repeat(5) {
        robot.say(robot.strTexts[it])
    }
    robot.myModifier = robot.setModifier()

    repeat(5) {
        robot.say(robot.strTexts[it])
    }
}

class Robot {

    val strTexts: List<String> = listOf(
        "Привет! я Робот",
        "Я умею писаьт и читать",
        "Привет мир! я Робот переводчик",
        "Ландэн из зэ кэпитал ов грейт британ",
        "как прекрасен этот мир - посмотри"
    )
    var myModifier: (String) -> String = { it }
    fun say(text: String) {
        println("Robot говорит: ${myModifier(text)}")
    }

    fun setModifier(): (String) -> String = { it.reversed() }
}
