fun main() {
    val trainingDay = 5

    val flagStatus = (trainingDay % 2 == 0)

    val hands = !flagStatus
    val handText = "Упражнения для рук:"
    val legs = flagStatus
    val legsText = "Упражнения для ног:"
    val back = flagStatus
    val backText = "Упражнения для спины:"
    val press = !flagStatus
    val pressText = "Упражнения для пресса:"


    print(
        String.format(
            "%-22s %b%n%-22s %b%n%-22s %b%n%-22s %b%n",
            handText,
            hands,
            legsText,
            legs,
            backText,
            back,
            pressText,
            press
        )
    )

}

