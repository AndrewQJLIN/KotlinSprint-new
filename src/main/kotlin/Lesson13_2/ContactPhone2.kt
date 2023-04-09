package Lesson13_2

class ContactPhone2(
    private val phoneNumber: Long,
    private val phoneName: String,
    var companyName: String?,

    )
{
fun printContact() {
    println("Имя: $phoneName\nНомер: $phoneNumber\nКомпания: ${companyName ?: "[не указано]"} \n")
}
}
