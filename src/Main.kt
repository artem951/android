fun main() {
    val human1 = Human("Иван Иванов", 25, 1.0)
    val human2 = Human("Пётр Петров", 30, 1.5)
    val driver = Driver("Алексей Водитель", 40, 2.0, 0.0)

    val movers: List<Movable> = listOf(human1, human2, driver)

    val threads = movers.map { mover ->
        Thread {
            repeat(5) {
                mover.move()
                println("${Thread.currentThread().name}: $mover")
                Thread.sleep(400)
            }
        }
    }

    threads.forEach { it.start() }
    threads.forEach { it.join() }

    println("Симуляция завершена ✅")
}
