package Lesson20_Task4

fun main() {
    val listString: List<String> = listOf(
        "glass", "market", "back", "feeling",
        "love", "hate", "fear", "gold",
        "field", "blow", "laugh",
        "cough", "cry", "jump",
        "fall", "cook", "building", "level",
        "law", "chalk", "manager", "after",
        "again", "all", "and", "animal",
    )

    listString.map { it: String -> "Нажат элемент $it" }
        .forEachIndexed { index, unit -> if (index % 2 == 0) println(unit) }
}
