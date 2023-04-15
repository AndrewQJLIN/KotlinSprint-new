package Lesson16_Task5

fun main() {
    val newPlayer = Player("Nik", 100, 20)
    do {
        newPlayer.currentStatus()
        battleRound(newPlayer, (-20..10).random())
    } while (newPlayer.getHealingStatus())
}

fun battleRound(player: Player, healthChange: Int) {
    println("------ БОЙ!")
    if (healthChange > 0) player.getHealing(healthChange)
    else player.getDamage(healthChange)
}

class Player(
    private val name: String,
    private var health: Int,
    private var force: Int,
    private var healingStatus: Boolean = true
) {
    fun getHealingStatus(): Boolean = healingStatus
    fun currentStatus() {
        print("Состояние игрока $name ")
        println("Здоровье - $health, сила удара - $force")
    }

    fun getDamage(damage: Int) {
        println("Получение урона на $damage")
        health += damage
        if (health <= 0) {
            println("Игрок умирает!")
            death()
            return
        } else
            println("ЗДОРОВЬЕ = $health")
    }

    fun getHealing(healing: Int) {
        if (healingStatus) {
            health += healing
            println("Пополнение здоровья на +$healing. ЗДОРОВЬЕ = $health")
        }
    }

    private fun death() {
        force = 0
        health = 0
        healingStatus = !healingStatus

    }
}