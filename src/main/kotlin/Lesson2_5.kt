import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val depositStartSum = 70_000
    val rate = 16.7
    val depositTime = 20

    val rateFormula = (1+rate/100)
    // var depositSum= (depositStartSum * rateFormula.pow(depositTime)*1000).roundToInt()*0.001
    var depositSum = depositStartSum * rateFormula.pow(depositTime)

    // println("Сумма депозита с %% - $depositSum")
    println("%.3f".format(depositSum))
}