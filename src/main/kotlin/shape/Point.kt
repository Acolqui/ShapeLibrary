package shape

class Point(private var x: Double, private var y: Double) {

    fun GetX(): Double {
        return x
    }

    fun GetY(): Double {
        return y
    }

    fun Clone(): Point {
        return Point(x, y)
    }

    fun MovePoint(addXvalue: Double, addYvalue: Double) {
        x += addXvalue
        y += addYvalue
    }
}