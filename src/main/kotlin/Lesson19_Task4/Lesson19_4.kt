package Lesson19_Task4

fun main() {
val tank = Tank()
    tank.loadBullet(Bullet.BLUE)
    tank.shoot()
    tank.loadBullet(Bullet.GREEN)
    tank.shoot()
    tank.loadBullet(Bullet.RED)
    tank.shoot()
}


class Tank() {
    private lateinit var currentBullet: Bullet
    fun loadBullet(bullet: Bullet) {
        currentBullet = bullet
        println("Заряжен снаряд - ${currentBullet.name}")
    }

    fun shoot() {
        println("ВЫСТРЕЛ!\nНанесен урон ${currentBullet.damage} единиц\n")
    }
}

enum class Bullet(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}