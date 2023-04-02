package lesson4

fun main() {
    val trainingDay = 5

    val dayEvenOdd = trainingDay % 2 == 0

    val hands = !dayEvenOdd
    val legs = dayEvenOdd
    val back = dayEvenOdd
    val press = !dayEvenOdd

    print(
        String.format(
            "%-22s %b%n%-22s %b%n%-22s %b%n%-22s %b%n",
            "Упражнения для рук:",
            hands,
            "Упражнения для ног:",
            legs,
            "Упражнения для спины:",
            back,
            "Упражнения для пресса:",
            press
        )
    )

}

