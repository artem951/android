class Driver(
    fullName: String,
    age: Int,
    currentSpeed: Double,
    var directionAngle: Double
) : Human(fullName, age, currentSpeed) {
    override fun move() {
        val angleRad = Math.toRadians(directionAngle)
        x += currentSpeed * kotlin.math.cos(angleRad)
        y += currentSpeed * kotlin.math.sin(angleRad)
    }

    override fun toString(): String {
        return "$fullName (Driver, возраст $age): координаты (x=${"%.2f".format(x)}, y=${"%.2f".format(y)})"
    }
}
