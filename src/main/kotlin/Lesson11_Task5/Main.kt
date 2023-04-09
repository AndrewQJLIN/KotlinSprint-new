package Lesson11_Task5

fun main() {

    val forumNew = Forum()

    forumNew.newUser()
    forumNew.newUser()


    forumNew.newMessage(0,"Привет мир")
    forumNew.newMessage(1, "привет всем")
    forumNew.newMessage(0,"Я туту")
    forumNew.newMessage(1, "Огого")

    forumNew.printThread()
}