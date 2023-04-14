package Lesson15_4

fun main() {
    val musicStore = MusicStore("Бременские музыканты")
    val zip1 = Zip("Струны", 45)
    val zip2 = Zip("Гриф", 5)
    val zip3 = Zip("Полотно", 11)
    val zip4 = Zip("Барашки", 12)
    val zip5 = Zip("Обода", 5)
    val zip6 = Zip("Смычок", 5)
    val zip7 = Zip("Палочки", 6)

    val insr1 = Instrument("Гитара", 4, listOf("Струны", "Гриф", "Барашки"))
    val insr2 = Instrument("Барабан", 5, listOf("Палочки", "Обода", "Полотно"))
    val insr3 = Instrument("Скрипка", 7, listOf("Струны", "Гриф", "Барашки", "Смычок"))

    musicStore.listGoodsInstrument = mutableListOf(insr1, insr2, insr3)
    musicStore.listGoodsZip = mutableListOf(zip1, zip2, zip3, zip4, zip5, zip6, zip7)
    musicStore.printWarehouse()

    println()
    insr1.searchZip("Гриф", musicStore)
    insr2.searchZip("Клавиша", musicStore)


}

class MusicStore(val name:String) {
    var listGoodsInstrument: MutableList<Instrument> = mutableListOf()
    var listGoodsZip: MutableList<Zip> = mutableListOf()

    fun printWarehouse() {
        println("Магазин - \"$name\"")
        listGoodsInstrument.forEach { it.displayConsistGood() }
        listGoodsZip.forEach { it.displayConsistGood() }
    }
}

abstract class GoodsMusic(
    val goodsName: String,
    val count: Int,
) {
    open fun displayConsistGood() {
        println("$goodsName - $count шт.")
    }
}

class Instrument(
    goodsName: String,
    count: Int,
    val listZip: List<String> = listOf()
) : GoodsMusic(goodsName = goodsName, count = count), ZipSearch {

    override fun searchZip(zipSearch: String, store: MusicStore) {
        println("Выполняется поиск запчасти \"$zipSearch\" для инструмента \"$goodsName\"")
        val count = store.listGoodsZip.firstOrNull { it.goodsName == zipSearch }?.count
        if (count != null) {
            println("Запчасть \"$zipSearch\" для инструмента \"$goodsName\" числиться на складе магазина \"${store.name}\" в количестве $count шт.")
        } else println("Запчасти \"$zipSearch\" для инструмента \"$goodsName\" не найдены на складе магазина \"${store.name}\"")
    }

    override fun displayConsistGood() {
        print("ИНСТРУМЕНТ: ")
        super.displayConsistGood()
    }
}

class Zip(goodsName: String, count: Int) : GoodsMusic(goodsName = goodsName, count = count) {
    override fun displayConsistGood() {
        print("Запчасть: ")
        super.displayConsistGood()
    }
}

interface ZipSearch {
    fun searchZip(zip: String, store: MusicStore)
}