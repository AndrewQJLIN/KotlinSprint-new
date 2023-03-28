fun main() {

    val massGood_1 = 20
    val massGood_2 = 50

    val volumeGood_1 = 80
    val volumeGood_2 = 100

    println("Average для груза с весом $massGood_1 кг и объемом $volumeGood_1 литров:" +
            "${massGood_1 >= WEIGHT_START && massGood_1 <= WEIGHT_END && volumeGood_1 < VOLUME_GOODS}")
    println("Average для груза с весом $massGood_2 кг и объемом $volumeGood_2 литров:" +
            "${massGood_2 >= WEIGHT_START && massGood_2 <= WEIGHT_END && volumeGood_2 < VOLUME_GOODS}")

}

const val WEIGHT_START = 35
const val WEIGHT_END = 100
const val VOLUME_GOODS = 100