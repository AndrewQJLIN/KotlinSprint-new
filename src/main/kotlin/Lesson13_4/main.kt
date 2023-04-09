package Lesson13_4

fun main() {
    var contactsList = mutableListOf<ContactPhone4>()

    for (i in 1..3) {
        contactsList += ContactPhone4(
            phoneNumber = if ((0..5).random() != 1) (8_000_000_00_00..8_999_999_99_99).random() else null,
            phoneName = if ((0..4).random() != 1) getName(6) else null,
            companyName = if ((0..3).random() != 1) getCompany(4, 6) else null,
        )
    }


    do {
        println("Если хотите добавить новую запись, введите \"да\"")
        if (readln() == "да") {
            val newContact = getNewContact()
            if (newContact != null) contactsList += newContact
        } else break
    } while (true)


    contactsList.forEach { it.printContact() }
}


fun getNewContact(): ContactPhone4? {
    val newContact = ContactPhone4(null, null, null)
    println("Введите имя контакта")
    newContact.phoneName = readln()
    if (newContact.phoneName == "") newContact.phoneName = null


    newContact.phoneNumber = getInputPhoneNumber() ?: return null

    println("Введите название компании")
    newContact.companyName = readln()
    if (newContact.companyName == "") newContact.companyName = null

    return newContact
}


fun getInputPhoneNumber(): Long? {
    val rangeDigit = '0'..'9'

    do {
        println("Введите номер телефона")
        val phoneNumber = readln()
        if (phoneNumber == "") {
            println("Номера нет - контакт не добавлен!")
            return null
        }

        val index = phoneNumber.length

        for (i in 0..index) {
            if (phoneNumber[i] !in rangeDigit) {
                println("Номер должен содержать только цифры")
                break
            } else {
                if (i == (index - 1)) {
                    return phoneNumber.toLong()
                }
            }
        }


    } while (true)

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
