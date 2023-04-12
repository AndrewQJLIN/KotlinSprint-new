package Lesson14_Task5

import kotlin.math.sqrt

fun main() {

    val figureList: MutableList<Figure> = mutableListOf()
    val circle1 = Circle(10.0, "RED")
    figureList += circle1
    val circle2 = Circle(14.0, "GREEN")
    figureList += circle2

    val rect1 = Rectangle(12.0, 15.0, "RED")
    figureList += rect1
    val rect2 = Rectangle(7.2, 9.7, "BLACK")
    figureList += rect2

    val trian1 = Triangle(6.1, 8.8, 12.4, "BLACK")
    figureList += trian1
    val trian2 = Triangle(15.3, 10.7, 6.9, "GREEN")
    figureList += trian2

    println("Сумма периметров фигур цвета RED = ${sumOfPerimeters(figureList,"RED")}")
    println("Сумма площадей фигур цвета RED = ${sumOfSquares(figureList,"RED")}")

}

fun sumOfPerimeters(figureList: MutableList<Figure>, color: String):Double {

    var result = 0.0
    figureList.filter {it.color==color}.forEach{ result += it.perimetrCalc() }
        return result
    }


fun sumOfSquares(figureList: MutableList<Figure>, color: String):Double {
    var result = 0.0
    figureList.filter {it.color==color}.forEach{ result += it.squareCalc() }
    return result
}
abstract class Figure(val color: String) {

    abstract fun squareCalc(): Double
    abstract fun perimetrCalc(): Double
}

class Circle(
    private val radius: Double,
    color: String
) : Figure(color = color) {
    override fun squareCalc(): Double {
        return radius * radius * 3.14
    }

    override fun perimetrCalc(): Double {
        return 2 * 3.14 * radius
    }
}

class Rectangle(
    private val width: Double,
    private val heith: Double,
    color: String
) : Figure(color = color) {
    override fun squareCalc(): Double {
        return width * heith
    }

    override fun perimetrCalc(): Double {
        return (width + heith) * 2
    }

}

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    color: String
) : Figure(color = color) {
    override fun squareCalc(): Double {
        val poluPerimetr: Double = perimetrCalc() / 2
        return sqrt(poluPerimetr * (poluPerimetr - sideA) * (poluPerimetr - sideB) * (poluPerimetr - sideC))
    }

    override fun perimetrCalc(): Double {
        return sideA + sideB + sideC
    }

}