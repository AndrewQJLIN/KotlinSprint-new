package Lesson17_Task1

fun main() {

    val quizList: MutableList<QuizQuestion> = mutableListOf(
        QuizQuestion("Сколько будет 2+2", "4", 3),
        QuizQuestion("Сколько будет 3*3", "9", 1),
        QuizQuestion("Сколько будет 0+0", "0"),
        QuizQuestion("Сколько будет 9+8", "17", 2),
        QuizQuestion("Сколько будет 89-36", "53", 9),
        QuizQuestion("Сколько будет желтый башмачок + игрушка", "пустота", 10),
        QuizQuestion("Сколько будет убудет", "")
    )

    var result = 0
    val maxResult = quizList.sumOf { it.questionSkill ?: 0 }
    quizList.forEach {
        println("Внимание вопрос: ${it.question}")
        println("Введите Ваш ответ")
        val answer = readln()
        if (it.answer == answer) {
            println("Верно")
            result += it.questionSkill ?: 0
        } else {
            println("Ошибка")
        }
    }
    println("Вы набрали $result баллов из $maxResult возможных")
}

class QuizQuestion(question: String, answer: String, val questionSkill: Int? = null) {


    var question: String = question
        set(value) {
            field = if (value.isEmpty()) {
                println("Ничего не введено. Требуется ввести какой либо вопрос")
                ""
            } else {
                println("Вопрос введен в базу")
                value
            }
        }
    var answer: String = answer
        get() = if (questionSkill != null) {
            println("Это вопрос на $questionSkill баллов")
            field
        } else {
            println("Вопрос без баллов")
            field
        }
        set(value) {
            field = if (value.isEmpty()) {
                println("Ничего не введено. Требуется ввести какой либо ответ")
                ""
            } else {
                println("Ответ введен в базу")
                value
            }
        }
}