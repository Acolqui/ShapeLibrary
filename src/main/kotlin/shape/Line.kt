package shape

import kotlin.math.hypot

class Line(private val pointOne: Point, private val pointTwo: Point) {

    init {
        if (pointOne.GetX() == pointTwo.GetX() &&
            pointOne.GetY() == pointTwo.GetY()
        ) {
            throw IllegalArgumentException("The two points cannot be the same.")
        }
    }

    fun GetPointOne(): Point {
        return pointOne
    }

    fun GetPointTwo(): Point {
        return pointTwo
    }

    fun GetSlope(): Double {
        return (pointTwo.GetY() - pointOne.GetY()) /
                (pointTwo.GetX() - pointOne.GetX())
    }

    fun GetLength(): Double {
        return hypot(
            pointTwo.GetX() - pointOne.GetX(),
            pointTwo.GetY() - pointOne.GetY()
        )
    }

    fun MoveLine(addXvalue: Double, addYvalue: Double) {
        pointOne.MovePoint(addXvalue, addYvalue)
        pointTwo.MovePoint(addXvalue, addYvalue)
    }
}