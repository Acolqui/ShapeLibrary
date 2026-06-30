package shape

import kotlin.math.PI

class Circle(
    private val middlePoint: Point,
    private val radius: Double
) {

    init {
        if (radius <= 0) {
            throw IllegalArgumentException("Radius cannot be negative or 0")
        }
    }

    fun GetMiddlePoint(): Point {
        return middlePoint
    }

    fun GetRadiusOne(): Double {
        return radius
    }

    fun GetRadiusTwo(): Double {
        return radius
    }

    fun GetArea(): Double {
        return PI * radius * radius
    }

    fun MoveCircle(addXvalue: Double, addYvalue: Double) {
        middlePoint.MovePoint(addXvalue, addYvalue)
    }
}