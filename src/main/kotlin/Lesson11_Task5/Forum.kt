package Lesson11_Task5

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