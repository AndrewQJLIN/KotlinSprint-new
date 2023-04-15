package Lesson16_Task2

fun main() {
    val circle1 = Circle(10.0)
    println("Длина окружности = ${circle1.lenghtCircle()}")
    println("Площадь окружности = ${circle1.squareCircle()}")
}

class Circle(private val radius: Double) {
    private val numberPI = 3.14
    fun lenghtCircle(): Double = 2 * numberPI * radius
    fun squareCircle(): Double = numberPI * radius * radius
}