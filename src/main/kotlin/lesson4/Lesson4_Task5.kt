package lesson4

fun main() {

    println("Есть ли провреждения корпуса (напишите)?\nfalse - если НЕТ повреждений\ntrue - если ДА, ЕСТЬ повреждения")
    val conditionStatus = readln().toBoolean()
    println("Введите численность экипажа (число):")
    val crewSize = readln().toInt()
    println("Введите число ящиков провизии (число):")
    val provisionBoxes = readln().toInt()
    println("Благоприятна ли погода (напишите)?\nfalse - если НЕТ, погода НЕ благоприятная\ntrue - если ДА, погода благоприятная")
    val weatherStatusIsGood = readln().toBoolean()

    val readyToStart =
        ((!conditionStatus && (crewSize >= MINIMUM_CREW_SIZE && crewSize < MAXIMUM_CREW_SIZE)) ||
                (crewSize == MAXIMUM_CREW_SIZE && weatherStatusIsGood))
                &&
                provisionBoxes > MINIMUM_PROVISION_BOXES

    println("При введенных данных отправка корабля: ${readyToStart}")
}

const val MINIMUM_CREW_SIZE = 55
const val MAXIMUM_CREW_SIZE = 70
const val MINIMUM_PROVISION_BOXES = 50















