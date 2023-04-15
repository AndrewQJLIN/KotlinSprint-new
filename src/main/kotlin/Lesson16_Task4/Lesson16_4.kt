package Lesson16_Task4

fun main() {

    val newOrder = Order(12547, "В работе")
    newOrder.printOrderStatus()
    sendManagerChange(newOrder, "Готов")
    newOrder.printOrderStatus()
}

fun sendManagerChange(order: Order, newStatus: String) {
    println("Заказ отправлен менеджеру на изменение статуса")
    order.changeOrderStatus(newStatus)
}

class Order(
    private val orderNumber: Int,
    private var statusOrder: String
) {
    fun changeOrderStatus(newStatus: String) {
        statusOrder = newStatus
    }

    fun printOrderStatus() {
        println("Заказ  $orderNumber в статусе $statusOrder")
    }
}
