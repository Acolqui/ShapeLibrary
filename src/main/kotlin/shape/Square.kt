package shape

import kotlin.math.abs

class Square(private val pointOne: Point) {

    private val pointTwo: Point

    init {
        // Set pointTwo to opposite corner by cloning pointOne
        pointTwo = pointOne.Clone()
        pointTwo.MovePoint(pointOne.GetX(), -pointOne.GetY())

        // Optional: reject 0 area square
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

    fun GetArea(): Double {
        val area = abs(pointTwo.GetX() - pointOne.GetX()) *
                   abs(pointTwo.GetY() - pointOne.GetY())
        return area
    }

    fun MoveSquare(addXvalue: Double, addYvalue: Double) {
        pointOne.MovePoint(addXvalue, addYvalue)
        pointTwo.MovePoint(addXvalue, addYvalue)
    }
}