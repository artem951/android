fun main() {
    val humans = arrayOf(
        Human("Иван Иванов", 20, 1.0),
        Human("Пётр Петров", 22, 1.2),
        Human("Сергей Сидоров", 19, 0.8)
    )

    val simulationTime = 10

    for (t in 1..simulationTime) {
        println("---- Шаг $t ----")
        humans.forEach {
            it.move()
            println(it)
        }
        Thread.sleep(500)
    }
}

class Human(
    var fullName: String,
    var age: Int,
    var currentSpeed: Double
) {
    var x: Double = 0.0
    var y: Double = 0.0

    fun move() {
        val angle = Math.random() * 2 * Math.PI
        x += currentSpeed * kotlin.math.cos(angle)
        y += currentSpeed * kotlin.math.sin(angle)
    }

    override fun toString(): String {
        return "$fullName (возраст $age): координаты (x=${"%.2f".format(x)}, y=${"%.2f".format(y)})"
    }
}