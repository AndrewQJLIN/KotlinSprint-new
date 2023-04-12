package Lesson11_Task5

fun main() {

    val forumNew = Forum()

    do {
        println("Введите Ваш никнэйм")
        val nickName = readln()
    } while (forumNew.newUser(nickName))

    do {
        println("Введите Ваш никнэйм")
        val nickName = readln()
    } while (forumNew.newUser(nickName))


    do {
        println("Для ввода сообщения введите Ваш Id")
        val idItem = readln().toInt()
        println("Введите Ваше сообщение")
        val messageItem = readln()
        if (forumNew.newMessage(idItem, messageItem)) {
            println("Сообщение добавлено на форум")
        } else {
            println("Неверные данные! Сообщение не добавлено")
        }
        println("Хотите продолжить = да / нет")

        if (readln() != "да") break

    } while (true)

    forumNew.printThread()
}

class MessageForum(
    val authorId: Int,
    val message: String,
)

class User(
    val userName: String,
    val userId: Int
)

class Forum(
    private val forumUsers: MutableSet<User> = mutableSetOf<User>(),
    private val messageForum: MutableList<MessageForum> = mutableListOf(),
) {


    fun newUser(nickName: String): Boolean {
        forumUsers.forEach { if (it.userName == nickName) return true }

        forumUsers += User(nickName, forumUsers.size + 1)
        println("Привет ${forumUsers.last().userName} - Вы добавлены на форум - Ваш ID ${forumUsers.last().userId}")
        return false
    }

    fun newMessage(authorId: Int, message: String): Boolean {
        var i: Int = 0
        forumUsers.forEach { if (it.userId == authorId) i++ }
        if (i == 0) return false
        messageForum.add(MessageForum(authorId, message))
        return true
    }

    fun printThread() {
        messageForum.forEach { message ->
            print("${forumUsers.filter { it.userId == message.authorId }[0].userName}: ")
            println(message.message)
        }
    }
}