package Lesson13_2

fun main() {
    val cont1 = ContactPhone2(89123456789, "Ростислав", "Reddit")
    cont1.printContact()

    cont1.companyName = null

    cont1.printContact()
}

class ContactPhone2(
    private val phoneNumber: Long,
    private val phoneName: String,
    var companyName: String?,

    ) {
    fun printContact() {
        println("Имя: $phoneName\nНомер: $phoneNumber\nКомпания: ${companyName ?: "[не указано]"} \n")
    }
}
