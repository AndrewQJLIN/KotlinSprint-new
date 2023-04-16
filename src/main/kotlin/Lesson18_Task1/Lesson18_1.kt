package Lesson18_Task1

import lesson14_2.BaseShip

fun main() {

    val listOfOrder: MutableList<BaseGood> = mutableListOf(
        OrderOneItem(569, "Носки"),
        OrderOneItem(676, "Лампа"),
        OrderOneItem(3569, "Ноутбук"),
        OrderOneItem(5669, "Пенал"),
        OrderOneItem(5697, "Игра"),
        OrderMultiItem(432, listOf("Соль", "Спички", "Мыло")),
        OrderMultiItem(1432, listOf("Масло", "Яйца", "Хлеб")),
        OrderMultiItem(4132, listOf("Гитара", "Барабан", "Рында","Скрипка")),
        OrderMultiItem(4322, listOf("1", "2", "3")),
    )

    listOfOrder.forEach { it.printOrder() }
}


abstract class BaseGood(val orderNumber: Int) {
    abstract fun printOrder()
}

class OrderOneItem(orderNumber: Int, private val nameGood: String) : BaseGood(orderNumber = orderNumber) {
    override fun printOrder() {
        println("ЗАКАЗ: $orderNumber ЗАКАЗАН ТОВАР: $nameGood")
    }

}

class OrderMultiItem(orderNumber: Int, private val listGood: List<String>) : BaseGood(orderNumber = orderNumber) {
    override fun printOrder() {
        println("ЗАКАЗ: $orderNumber ЗАКАЗАНЫ ТОВАРЫ: $listGood")
    }

}