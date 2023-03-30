fun main() {
    val userName = "Batman"
    val userPassword = "password"

    println("Enter your user name:")
    val textOut = if (readln() != userName) {
        "Please registration!"
    } else {
        println("Good day, $userName")
        println("Enter your password")
        if (readln() != userPassword) {
            "Authorisation is failed!"
        } else "You successful authorisation!"
    }
    println(textOut)
}