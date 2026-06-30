package shape

import kotlin.math.abs

class Rectangle(private val pointOne: Point, private val pointTwo: Point) {

    init {
        if (GetArea() <= 0) {
            throw IllegalArgumentException("The two points cannot be the same.")
        }
    }

    fun GetPointOne(): Point {
        return pointOne
    }

    fun GetPointTwo(): Point {
        return pointTwo
    }

    fun GetArea(): Double {
        return abs(pointTwo.GetX() - pointOne.GetX()) *
                abs(pointTwo.GetY() - pointOne.GetY())
    }

    fun MoveRectangle(addXvalue: Double, addYvalue: Double) {
        pointOne.MovePoint(addXvalue, addYvalue)
        pointTwo.MovePoint(addXvalue, addYvalue)
    }
}