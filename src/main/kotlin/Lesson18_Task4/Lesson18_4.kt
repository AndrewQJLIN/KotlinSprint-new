package Lesson18_Task4

fun main() {
    val listPackage:List<Package> = listOf(
        RectanglePackage(0.10, 0.20, 0.15),
        RectanglePackage(0.18, 0.23, 0.11),
        CubePackage(0.54)
    )
    listPackage.forEach { println(" ${it.returnSquare().toString()} м.кв") }
}

abstract class Package {
    abstract fun returnSquare(): Double
}

class RectanglePackage(
    private val height: Double,
    private val lenght: Double,
    private val width: Double
) : Package() {
    override fun returnSquare(): Double = (height * lenght * 2) + (height * width * 2) + (lenght * width * 2)
}

class CubePackage( private val side:Double):Package() {
    override fun returnSquare(): Double = side*side*6
}