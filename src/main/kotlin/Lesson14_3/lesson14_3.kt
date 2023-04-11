package Lesson14_3

fun main() {

    val post1 = Post(
        "ЮРА",
        """ это текст-\"рыба\", часто используемый в печати и вэб-дизайне. 
            | Lorem Ipsum является стандартной \"рыбой\" " 
            | "для текстов на латинице с начала XVI века. 
            | В то время некий безымянный печатник создал большую коллекцию " +
            | "размеров и форм шрифтов, используя Lorem Ipsum для 
            | распечатки образцов.""".trimMargin()
    )
    post1.printMessage()

    val comment1 = Comment("ALEX", "It's GREET!~!", post1)
    comment1.printMessage()
    val comment2 = Comment("JOHN", "I am fine", post1)
    comment2.printMessage()

}

open class MessageOnForum(
    val author: String,
    val message: String,
) {
    open fun printMessage() {
        println("$author: $message")
    }
}

class Comment(
    author: String, message: String,
    private val post: Post
) : MessageOnForum(author, message) {
    override fun printMessage() {
        println("Comment to post ${post.author}:${post.message.take(25)}...")
        super.printMessage()
    }
}

class Post(
    author: String,
    message: String
) : MessageOnForum(author, message) {
    override fun printMessage() {
        println("POST START----------------")
        println("АВТОР: $author")
        println("""
        ТЕКСТ: $message
        """.trimIndent())
        println("__________________POST END")
        println()
    }
}