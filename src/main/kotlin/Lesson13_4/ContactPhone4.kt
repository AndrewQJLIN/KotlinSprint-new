package Lesson13_4

class ContactPhone4 (
    var phoneNumber: Long?,
    var phoneName: String?,
    var companyName: String?,

    )
{
    fun printContact() {
        println("Имя: ${phoneName?:"[не указано]"} Номер: ${phoneNumber?:"[не указано]"} Компания: ${companyName ?:"[не указано]"}")
    }
}