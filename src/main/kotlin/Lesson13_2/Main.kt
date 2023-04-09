package Lesson13_2

fun main() {
val cont1 = ContactPhone2(89123456789, "Ростислав", "Reddit")
    cont1.printContact()

    cont1.companyName = null

    cont1.printContact()
}