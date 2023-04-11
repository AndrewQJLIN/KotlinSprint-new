package Lesson13_Task3


fun main() {
    var contactsList = mutableListOf<PhoneContact3>()

    for (i in 1..10) {
        contactsList += PhoneContact3(
            phoneNumber = (8_000_000_00_00..8_999_999_99_99).random(),
            phoneName = if ((0..3).random() != 1) getName(6) else null,
            companyName = if ((0..3).random() != 1) getCompany(4, 6) else null,
        )
    }
    contactsList.forEach { it.printContact() }
}

fun getName(maxSize: Int): String {
    var nameOut: String = ""
    val rangeLetter = 'A'..'Z'
    for (i in 0..maxSize) {
        nameOut += rangeLetter.random().toString()
    }
    return nameOut
}

fun getCompany(first: Int, second: Int): String {
    return "${getName(first)} ${getName(second)}"
}

class PhoneContact3(
    private val phoneNumber: Long,
    private val phoneName: String?,
    private var companyName: String?,
) {
    fun printContact() {
        println("Имя: ${phoneName ?: "[не указано]"}\nНомер: $phoneNumber\nКомпания: ${companyName ?: "[не указано]"}\n")
    }
}