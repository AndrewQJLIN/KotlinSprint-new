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
    println("************А В Т О  -  П А Р К**************")
    autoParkTrack.forEach { it.moveCar() }
    autoParkPass.forEach { it.moveCar() }

    println("Введите сколько ТОНН ГРУЗА надо перевести (число)")
    var goodsNeedTransfer = readln().toInt()
    println("Введите сколько ЛЮДЕЙ надо перевести (число)")
    var peopleNeedTransfer = readln().toInt()


    autoParkTrack.forEachIndexed { _, trackCar ->
        if (goodsNeedTransfer >= 2) {
            trackCar.goodsTransfer(2); goodsNeedTransfer -= 2
            if (peopleNeedTransfer >= 1) {
                trackCar.peopleTransfer(1); peopleNeedTransfer--
            }
        } else {
            if (goodsNeedTransfer == 1) {
                trackCar.goodsTransfer(1); goodsNeedTransfer = 0
                if (peopleNeedTransfer >= 1) {
                    trackCar.peopleTransfer(1); peopleNeedTransfer--
                }
            }
        }
    }
    if (goodsNeedTransfer > 0) println("Не хватает грузовиков! Осталось перевезти еще $goodsNeedTransfer тонн")

    autoParkPass.forEachIndexed { _, passCar ->
        if (peopleNeedTransfer >= 3) {
            passCar.peopleTransfer(3); peopleNeedTransfer -= 3
        } else {
            if (peopleNeedTransfer >= 2) {
                passCar.peopleTransfer(2); peopleNeedTransfer -= 2
            } else {
                if (peopleNeedTransfer >= 1) {
                    passCar.peopleTransfer(1); peopleNeedTransfer = 0
                }
            }
        }
    }
    if (peopleNeedTransfer > 0)
        println("Не хватает пассажирских машин! Осталость перевезти еще $peopleNeedTransfer пассажиров")
}

open class Car(open val maxSpeed: Int, val govNumber: String) : Movable {
    override fun moveCar() {
        println("г/н $govNumber - его максимальная скорость $maxSpeed км/ч")
    }
}

class PassangersCar(maxSpeed: Int, govNumber: String) : Car(maxSpeed = maxSpeed, govNumber = govNumber),
    PeopleTransfer {
    override fun moveCar() {
        println("Пассажирский авто: (перевозит за раз до 3-х человек)")
        super.moveCar()
    }

    override fun peopleTransfer(countPeople: Int) {
        if (countPeople <= 0) return
        println("Авто г/н $govNumber - перевез $countPeople человек")
    }
}

class TrackCar(maxSpeed: Int, govNumber: String) : Car(maxSpeed = maxSpeed, govNumber = govNumber), PeopleTransfer,
    GoodsTransfer {
    override fun goodsTransfer(countTonn: Int) {
        if (countTonn <= 0) return
        println("Авто г/н $govNumber - перевез $countTonn тонн груза")
    }

    override fun moveCar() {
        println("Грузовик: (перевозит за раз до 2-х тонн груза и 1 человека)")
        super.moveCar()
    }

    override fun peopleTransfer(countPeople: Int) {
        if (countPeople <= 0) return
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
