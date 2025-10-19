fun main() {
    val human1 = Human("Иван Иванов", 25, 1.0)
    val human2 = Human("Пётр Петров", 30, 1.5)
    val driver = Driver("Алексей Водитель", 40, 2.0, 0.0)

    val humans = listOf(human1, human2, driver)

    val threads = humans.map { human ->
        Thread {
            repeat(5) {
                human.move()
                println("${Thread.currentThread().name}: $human")
                Thread.sleep(500)
            }
        }
    }

    threads.forEach { it.start() }
    threads.forEach { it.join() }

    println("Симуляция завершена ✅")
}
