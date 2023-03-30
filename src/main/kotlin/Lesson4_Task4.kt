fun main() {
    val trainingDay = 5

    val hands = !(trainingDay % 2 == 0)
    val handText = "Упражнения для рук:"
    val legs = (trainingDay % 2 == 0)
    val legsText = "Упражнения для ног:"
    val back = (trainingDay % 2 == 0)
    val backText = "Упражнения для спины:"
    val press = !(trainingDay % 2 == 0)
    val pressText = "Упражнения для пресса:"


//    if (trainingDay % 2 == 0) {
//        hands = !hands
//        legs = !legs
//        back = !back
//        press = !press
//    }

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

