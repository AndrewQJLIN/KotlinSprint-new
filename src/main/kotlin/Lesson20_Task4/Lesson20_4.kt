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
    val listLambda: List<() -> Unit> = listString.map { it: String -> { println("Нажат элемент $it") } }
    listLambda.forEachIndexed { index, unit -> if (index % 2 == 0) unit() }
}
