package Lesson18_Task5

fun main() {
    val screenItem = Screen()
    screenItem.draw(10, 10, Circle(25f))
    screenItem.draw(25.6f, 32.9f, Circle(12.3f))
    screenItem.draw(100, 100, Point())
    screenItem.draw(65.9f, 98.23f, Point())
    screenItem.draw(65, 89, Square(80.3f))
    screenItem.draw(69.3f, 12.4f, Square(25f))

    println()
    screenItem.listOfFigures.forEach { it.getPointStart() }

}

class Screen() {
    val listOfFigures: MutableList<Figure> = mutableListOf()
    fun draw(pointX: Int, pointY: Int, figure: Figure) {
        println("По координатам: x=${pointX}, y=${pointY}")
        figure.drawFigure()
        figure.putPoint(pointX, pointY)
        listOfFigures += figure
    }

    fun draw(pointX: Float, pointY: Float, figure: Figure) {
        println("По координатам: x=${pointX}, y=${pointY}")
        figure.drawFigure()
        figure.putPoint(pointX, pointY)
        listOfFigures += figure
    }
}

open class Figure() {
    private var xInt: Int? = null
    private var yInt: Int? = null
    private var xFloat: Float? = null
    var yFloat: Float? = null
    open fun drawFigure() {}
    fun putPoint(xInt: Int, yInt: Int) {
        this.xInt = xInt
        this.yInt = yInt
        this.xFloat = null
        this.yFloat = null
    }

    fun putPoint(xFloat: Float, yFloat: Float) {
        this.xFloat = xFloat
        this.yFloat = yFloat
        this.xInt = null
        this.yInt = null
    }

    open fun getPointStart() {
        println(
            "Стартовые координаты объекта: " +
                    if (xFloat == null) "X = ${this.xInt.toString()}, Y = ${this.yInt.toString()} "
                    else "X = ${this.xFloat.toString()}, Y = ${this.yFloat.toString()} "
        )
    }
}

class Point() : Figure() {
    override fun drawFigure() {
        println("Нарисована точка")
    }

    override fun getPointStart() {
        println("Объект ТОЧКА")
        super.getPointStart()
    }
}

class Circle(private val radius: Float) : Figure() {
    override fun drawFigure() {
        println("Нарисован круг с радиусом $radius")
    }

    override fun getPointStart() {
        println("Объект Круг - с радиусом ${radius.toString()}")
        super.getPointStart()
    }
}

class Square(private val side: Float) : Figure() {
    override fun drawFigure() {
        println("Нарисован квадрат со стороной $side")
    }

    override fun getPointStart() {
        println("Объект Квадрат - со стороной ${side.toString()}")
        super.getPointStart()
    }
}