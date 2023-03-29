fun main() {
    var hands = true
    val handText = "Упражнения для рук:"
    var legs = false
    val legsText = "Упражнения для ног:"
    var back = false
    val backText = "Упражнения для спины:"
    var press = true
    val pressText = "Упражнения для пресса:"
    val trainingDay = 5

    if(trainingDay % 2 == 0) {
        hands = !hands
        legs = !legs
        back = !back
        press = !press
    }

    print(String.format("%-22s %b%n%-22s %b%n%-22s %b%n%-22s %b%n",handText,hands,legsText,legs,backText,back,pressText,press))

}

