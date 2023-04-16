package Lesson17_Task4

fun main() {
    val package1 = Package(56987, "Москва")
    package1.arrivalNewPosition("Минск")
    package1.arrivalNewPosition("Гродно")
    package1.arrivalNewPosition("Тюмень")
    package1.arrivalNewPosition("Самара")
    package1.printTrekPackage()
}

class Package(private val number: Int, currentPosition: String) {
    private var counterPosition: Int = 1
    private var trekPosition: MutableList<String> = mutableListOf(currentPosition)
    private var currentPosition: String = currentPosition
        set(value) {
            counterPosition++
            trekPosition += value
            field = value
        }

    fun arrivalNewPosition(position: String) {
        currentPosition = position
    }

    fun printTrekPackage() {
        println("Package #$number is treking...")
        trekPosition.forEach { println(it) }
        println("__________________")
        println("Total position on trek = $counterPosition")


    }

}