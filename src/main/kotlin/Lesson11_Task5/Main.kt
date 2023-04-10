package Lesson11_Task5

fun main() {

    val forumNew = Forum()

    forumNew.newUser()
    forumNew.newUser()


    forumNew.newMessage(0, "Привет мир")
    forumNew.newMessage(1, "привет всем")
    forumNew.newMessage(0, "Я туту")
    forumNew.newMessage(1, "Огого")

    forumNew.printThread()
}

class MessageForum(
    val authorId: Int,
    val message: String,
) {

}

class Forum(
    private val forumUsers: MutableList<String> = mutableListOf(),
    private val messageForum: MutableList<MessageForum> = mutableListOf(),

    ) {

    fun newUser() {
        do {
            println("Введите Ваш никнэйм")
            val nickName = readln()

            if (!forumUsers.contains(nickName)) {
                forumUsers += nickName
                println("Привет $nickName - Вы добавлены на форум - Ваш ID ${forumUsers.lastIndex}")
                break
            } else {
                println("Такой никнэйм уже есть - введите новый")
            }
        } while (true)
    }

    fun newMessage(authorId: Int, message: String) {
        messageForum.add(MessageForum(authorId, message))
    }

    fun printThread() {
        messageForum.forEach {
            println("${forumUsers[it.authorId]} : ${it.message}")
        }

    }
}