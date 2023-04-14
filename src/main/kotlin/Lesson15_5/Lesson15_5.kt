package Lesson15_5

import kotlin.math.max

fun main() {

    val autoParkTrack: MutableList<TrackCar> = mutableListOf(
        TrackCar(120, "M564CM090"),
        TrackCar(90, "E531EBН120")
    )
    val autoParkPass: MutableList<PassangersCar> = mutableListOf(
        PassangersCar(220, "В564ВН120"),
        PassangersCar(180, "А001АА130"),
        PassangersCar(160, "У333ХХ120")
    )
    autoParkTrack.forEach { it.moveCar() }
    autoParkPass.forEach { it.moveCar() }

    var goodsNeedTransfer = 2
    var peopleNeedTransfer = 6
    var i = 0
    do {
        if (i > autoParkTrack.size - 1) {
            println("Не хватает грузовиков")
            break
        }
        var loadGoods = 0
        var loadPeople = 0
        loadGoods = if (goodsNeedTransfer >= 2) 2 else goodsNeedTransfer
        autoParkTrack[i].goodsTransfer(loadGoods)
        loadPeople = if (peopleNeedTransfer >= 1) 1 else 0
        autoParkTrack[i].peopleTransfer(loadPeople)
        i++
        goodsNeedTransfer -= 2
        peopleNeedTransfer -= 1
    } while (goodsNeedTransfer > 0)

    i = 0
    do {
        if (i > autoParkPass.size - 1) {
            println("Не хватает пассажирских машин")
            break
        }
        var loadPeople = 0
        loadPeople = if (peopleNeedTransfer >= 3) {
            3
        } else {
            peopleNeedTransfer
        }
        autoParkPass[i++].peopleTransfer(loadPeople)
        peopleNeedTransfer -= 3
    } while (peopleNeedTransfer > 0)


}

open class Car(open val maxSpeed: Int, val govNumber: String) : Movable {
    override fun moveCar() {
        println("г/н $govNumber - его максимальная скорость $maxSpeed км/ч")
    }


}

class PassangersCar(maxSpeed: Int, govNumber: String) : Car(maxSpeed = maxSpeed, govNumber = govNumber),
    PeopleTransfer {
    override fun moveCar() {
        println("Это пассажирский авто")
        super.moveCar()
    }

    override fun peopleTransfer(countPeople: Int) {
        println("Авто г/н $govNumber - перевез $countPeople человек")
    }
}

class TrackCar(maxSpeed: Int, govNumber: String) : Car(maxSpeed = maxSpeed, govNumber = govNumber), PeopleTransfer,
    GoodsTransfer {
    override fun goodsTransfer(countTonn: Int) {
        println("Авто г/н $govNumber - перевез $countTonn тонн груза")
    }

    override fun moveCar() {
        println("Это грузовик")
        super.moveCar()
    }

    override fun peopleTransfer(countPeople: Int) {
        println("Авто г/н $govNumber - перевез $countPeople человек")
    }
}


interface Movable {
    fun moveCar()
}

interface PeopleTransfer {
    fun peopleTransfer(countPeople: Int)
}

interface GoodsTransfer {
    fun goodsTransfer(countTonn: Int)
}
