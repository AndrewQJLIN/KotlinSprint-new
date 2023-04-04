package lesson7

fun main() {

    println("Введите конечное число")
    val endNumber = readln().toInt()

    for(i in 0 .. endNumber step 2)
        println(i)
}