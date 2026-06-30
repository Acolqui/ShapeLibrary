package shape

import kotlin.math.abs

class Triangle(
    private val pointOne: Point,
    private val pointTwo: Point,
    private val pointThree: Point
) {

    init {
        if (GetArea() <= 0) {
            throw IllegalArgumentException("Area cannot be 0")
        }
    }

    fun GetPointOne(): Point {
        return pointOne
    }

    fun GetPointTwo(): Point {
        return pointTwo
    }

    fun GetPointThree(): Point {
        return pointThree
    }

    fun GetArea(): Double {
        return 0.5 * abs(
            pointOne.GetX() * (pointTwo.GetY() - pointThree.GetY()) +
                    pointTwo.GetX() * (pointThree.GetY() - pointOne.GetY()) +
                    pointThree.GetX() * (pointOne.GetY() - pointTwo.GetY())
        )
    }

    fun MoveTriangle(addXvalue: Double, addYvalue: Double) {
        pointOne.MovePoint(addXvalue, addYvalue)
        pointTwo.MovePoint(addXvalue, addYvalue)
        pointThree.MovePoint(addXvalue, addYvalue)
    }
}