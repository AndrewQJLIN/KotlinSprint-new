package Lesson18_Task3

fun main() {
    val tamagochiList: List<TamagochiItem> = listOf(
        Fox("АЛИСА"),
        Dog("ТУЗИК"),
        Cat("МУРКА")
    )
    tamagochiList.forEach { println(it.whoIAmAndWhatIDo()) }
}

abstract class TamagochiItem(val name: String) {
    var whaIDo: String = ""
    var sleepNow: Boolean = false
    var eatNow: Boolean = false
    var playNow: Boolean = false
    open fun whoIAmAndWhatIDo(): String {
        return "$name - $whaIDo\n" + if (sleepNow) "сейчас сплю" else
            if (eatNow) "сейчас ем" else
                if (playNow) "сейчас играю" else ""
    }
}


class Fox(name: String) : TamagochiItem(name = name) {
    init {
        whaIDo = "Ем ягоды"
        eatNow = true
    }

    override fun whoIAmAndWhatIDo(): String {
        return "Я ЛИСА - " + super.whoIAmAndWhatIDo()
    }
}

class Dog(name: String) : TamagochiItem(name = name) {
    init {
        whaIDo = "Ем кости"
        playNow = true
    }

    override fun whoIAmAndWhatIDo(): String {
        return "Я СОБАКА - " + super.whoIAmAndWhatIDo()
    }
}

class Cat(name: String) : TamagochiItem(name = name) {
    init {
        whaIDo = "Ем рыбу"
        sleepNow = true
    }

    override fun whoIAmAndWhatIDo(): String {
        return "Я КОШКА - " + super.whoIAmAndWhatIDo()
    }
}
