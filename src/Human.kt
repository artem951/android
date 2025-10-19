class Human(
    var fullName: String,
    var age: Int,
    var currentSpeed: Double
) {
    var x: Double = 0.0
    var y: Double = 0.0

    fun move() {
        val dx = (-1..1).random().toDouble()
        val dy = (-1..1).random().toDouble()
        x += dx * currentSpeed
        y += dy * currentSpeed
    }

    override fun toString(): String {
        return "$fullName (возраст $age): позиция (x=${"%.2f".format(x)}, y=${"%.2f".format(y)})"
    }
}
