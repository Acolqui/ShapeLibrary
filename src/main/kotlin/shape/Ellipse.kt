package shape

import kotlin.math.PI

class Ellipse(
    private val middlePoint: Point,
    private val radiusOne: Double,
    private val radiusTwo: Double
) {

    init {
        if (radiusOne <= 0 || radiusTwo <= 0) {
            throw IllegalArgumentException("Radii cannot be negative or 0")
        }
    }

    fun GetMiddlePoint(): Point {
        return middlePoint
    }

    fun GetRadiusOne(): Double {
        return radiusOne
    }

    fun GetRadiusTwo(): Double {
        return radiusTwo
    }

    fun GetArea(): Double {
        return PI * radiusOne * radiusTwo
    }

    fun MoveEllipse(addXvalue: Double, addYvalue: Double) {
        middlePoint.MovePoint(addXvalue, addYvalue)
    }
}