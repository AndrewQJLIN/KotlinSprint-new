package Lesson13_Task3

class PhoneContact3 (
    private val phoneNumber: Long?,
    private val phoneName: String?,
    private var companyName: String?,

    )
{
    fun printContact() {
        println("Имя: ${phoneName ?:"[не указано]"}\nНомер: ${phoneNumber ?: "[не указано]"}\nКомпания: ${companyName ?: "[не указано]"}\n")
    }
}