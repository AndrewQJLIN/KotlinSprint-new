package Lesson15_3


fun main() {

    val newForum = Forum()

    val basicUser1 = BasicUser(0, "JON", newForum)
    val basicUser2 = BasicUser(1, "KIM", newForum)
    val basicUser3 = BasicUser(2, "LETA", newForum)
    val adminUser1 = AdminUser(3, "BigBoss", newForum)

    basicUser1.writeForum("Привет я тут")
    basicUser2.writeForum("Всем мир!")
    basicUser3.writeForum("УРА!УРА!УРА!")
    adminUser1.writeForum("НАВЕДУ ПОРЯДОК")

    newForum.printAllUsers()
    println()

    newForum.printAllMessage()
    println()

    adminUser1.removeMessageForum(2)
    adminUser1.removeBasicUser(basicUser3)

    newForum.printAllUsers()
    println()

    newForum.printAllMessage()
    println()
}


class OneMessageOnForum(
    val author: UserForum,
    val messageStr: String,
    val id: Int
) {
    fun printOneMessage() {
        println("Author: ${author.userName}\nMessage:($id) $messageStr")
    }
}

class Forum {
    val usersOnForum: MutableList<UserForum> = mutableListOf()
    val listMessages: MutableList<OneMessageOnForum> = mutableListOf()

    fun printAllMessage() {
        println("*************** List ALL MESSAGE ****************")
        listMessages.forEach { it.printOneMessage() }
        println("*************** List ALL MESSAGE ****************")
    }

    fun printAllUsers() {
        println("------------- List ALL users on FORUM ----------------")
        usersOnForum.forEach { it.printWhatIAm() }
        println("------------- List ALL users on FORUM ----------------")
    }
}

abstract class UserForum {
    abstract val userId: Int
    abstract val userName: String
    abstract val forum: Forum
    abstract fun readForum()
    abstract fun writeForum(message: String)
    abstract fun printWhatIAm()
}

class BasicUser(override val userId: Int, override val userName: String, override val forum: Forum) : UserForum() {
    init {
        forum.usersOnForum += this
    }

    override fun readForum() {
        println("Пользователь $userName - читает сообщения")
    }

    override fun writeForum(message: String) {

        forum.listMessages += OneMessageOnForum(this, message, forum.listMessages.size)
    }

    override fun printWhatIAm() {
        println("СТАТУС: Пользователь ИМЯ: $userName ID: $userId")
    }

}

class AdminUser(override val userId: Int, override val userName: String, override val forum: Forum) : UserForum() {

    init {
        forum.usersOnForum += this
    }

    override fun readForum() {
        println("Администратор $userName - читает сообщения")
    }

    override fun writeForum(message: String) {
        forum.listMessages += OneMessageOnForum(this, message, forum.listMessages.size)
    }

    override fun printWhatIAm() {
        println("СТАТУС: Администратор ИМЯ: $userName ID: $userId")
    }

    fun removeBasicUser(basicUser: BasicUser) {
        forum.usersOnForum.remove(basicUser)
        println("Адимин $userName удалил пользователя ${basicUser.userName}")
    }

    fun removeMessageForum(messageId: Int) {

        val deleteMessage = forum.listMessages.firstOrNull() { it.id == messageId }
        if (deleteMessage != null) {
            println("Админ удаляет сообщение ${deleteMessage.messageStr} от автора ${deleteMessage.author.userName}")
            forum.listMessages.remove(deleteMessage)
        }
    }
}

