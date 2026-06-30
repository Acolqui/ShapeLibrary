package shape

class Square(pointOne: Point, private val sideLength: Double) {

    private val pointOne: Point = pointOne.Clone()

    init {
        if (sideLength <= 0) {
            throw IllegalArgumentException("Square side length must be greater than 0")
        }
    }

    fun GetPointOne(): Point {
        return pointOne.Clone()
    }

    fun GetSideLength(): Double {
        return sideLength
    }

    fun GetArea(): Double {
        return sideLength * sideLength
    }

    fun MoveSquare(addXvalue: Double, addYvalue: Double) {
        pointOne.MovePoint(addXvalue, addYvalue)
    }
}