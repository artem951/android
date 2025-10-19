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

