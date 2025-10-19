class Human(
    var fullName: String,
    var age: Int,
    override var currentSpeed: Double
) : Movable {
    override var x: Double = 0.0
    override var y: Double = 0.0

    override fun move() {
        val angle = Math.random() * 2 * Math.PI
        x += currentSpeed * kotlin.math.cos(angle)
        y += currentSpeed * kotlin.math.sin(angle)
    }

    override fun toString(): String {
        return "$fullName (возраст $age): координаты (x=${"%.2f".format(x)}, y=${"%.2f".format(y)})"
    }
}
