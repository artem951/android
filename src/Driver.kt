class Driver(
    var fullName: String,
    var age: Int,
    override var currentSpeed: Double,
    var directionAngle: Double
) : Movable {

    override var x: Double = 0.0
    override var y: Double = 0.0

    override fun move() {
        val angleRad = Math.toRadians(directionAngle)
        x += currentSpeed * kotlin.math.cos(angleRad)
        y += currentSpeed * kotlin.math.sin(angleRad)
    }

    override fun toString(): String {
        return "$fullName (Driver, возраст $age): координаты (x=${"%.2f".format(x)}, y=${"%.2f".format(y)})"
    }
}
