fun main() {

    val weatherSunny = true
    val tentOpen = true
    val humidityValue = 20
    val seasonCurrent = "ЗИМА"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherSunny && tentOpen && humidityValue == 20 && seasonCurrent != "ЗИМА"}")

}