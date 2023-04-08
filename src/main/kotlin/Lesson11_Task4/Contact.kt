package Lesson11_Task4

class Contact(
    val userName: String = "",
    val userAvatar: String = "mouse_icon.jpg",
    val firstName: String = "FirstName",
    val secondName: String = "SecondName",

    val phoneNumCellular: String = "",
    val phoneNumCellularText: String = "сотовый",

    val phoneNumHome: String = "",
    val phoneNumHomeText: String = "домашний",
    val eMail: String = "mail@mail.ru",


    val iconWrite: String = "write_icon.jpg",
    val iconCall: String = "call_icon.jpg",
    val iconVideo: String = "video_icon.jpg",
    val iconEmail: String = "email_icon.jpg",

    val iconWriteText: String = "написать",
    val iconCallText: String = "вызов",
    val iconVideoText: String = "видео",
    val iconEmailText: String = "почта",

    val cameraTelText: String = "FaceTime",
    val cameraIcon: String = "camera_icom,jpg",
    val telephoneIcon: String = "tel_icon.jpg",
    private val listNearContact: MutableList<Contact> = mutableListOf()

) {

    fun callMethod() {}
    fun writeMethod() {}
    fun videoMethod() {}
    fun emailMethod() {}
    fun faceTimeMethod() {}
    fun addNearContact(contact: Contact) {
        listNearContact.add(contact)
    }

}