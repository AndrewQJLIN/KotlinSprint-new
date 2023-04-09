package Lesson13_Task3

fun main(){
var contactsList = mutableListOf<PhoneContact3>()

   for(i in 1 .. 10)
    {
       contactsList += PhoneContact3 (
           phoneNumber = if((0..3).random()!=1) (8_000_000_00_00 .. 8_999_999_99_99).random() else null,
           phoneName = if((0..3).random()!=1) getName(6) else null,
           companyName = if((0..3).random()!=1) getCompany(4,6) else null,
       )
    }

    contactsList.forEach { it.printContact() }
}

fun getName(maxSize:Int): String {
    var nameOut:String = ""
    val rangeLetter = 'A'..'Z'
    for (i in 0..maxSize) {
    nameOut += rangeLetter.random().toString()
    }
       return nameOut
}

fun getCompany(first:Int, second:Int): String {
    return "${getName(first)} ${getName(second)}"
}