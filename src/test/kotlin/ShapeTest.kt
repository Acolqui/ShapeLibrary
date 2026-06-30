package shape

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertFailsWith

class ShapeTest {
    // Point Class Tests
    @Test
    fun `Test Point Class Methods`() {
        val point = Point(2.0, 3.0)

        assertEquals(2.0, point.GetX())
        assertEquals(3.0, point.GetY())

        val clonePoint = point.Clone()

        assertNotSame(point, clonePoint)
        assertEquals(2.0, clonePoint.GetX())
        assertEquals(3.0, clonePoint.GetY())
    }


    // Line Class Tests

    @Test
    fun `Test Line Class Methods`() {

        // Create a line with two points
        val pointOne = Point(1.0, 2.0)
        val pointTwo = Point(3.0, 4.0)
        val line = Line(pointOne, pointTwo)

        assertEquals(pointOne, line.GetPointOne())
        assertEquals(pointTwo, line.GetPointTwo())

        // Test the length and slope of the line
        val lineLength = line.GetLength()
        val expectedLength = Math.sqrt(Math.pow(pointTwo.GetX() - pointOne.GetX(), 2.0) + Math.pow(pointTwo.GetY() - pointOne.GetY(), 2.0))
        assertEquals(expectedLength, lineLength)

        // Test the slope of the line
        val lineSlope = line.GetSlope()
        val expectedSlope = (pointTwo.GetY() - pointOne.GetY()) / (pointTwo.GetX() - pointOne.GetX())
        assertEquals(expectedSlope, lineSlope)

        // Test the MoveLine method
        line.MoveLine(1.0, 1.0);
        assertEquals(pointOne.GetX(),2.0)
        assertEquals(pointOne.GetY(),3.0)
        assertEquals(pointTwo.GetX(),4.0)
        assertEquals(pointTwo.GetY(),5.0)

    }

    // Line Class Tests Rejected Inputs

    @Test
    fun `Test Line Class Rejected Inputs`() {
        val pointOne = Point(1.0, 2.0)
        val pointTwo = Point(1.0, 2.0)

        val exception = assertFailsWith<IllegalArgumentException> {
            Line(pointOne, pointTwo)
        }

        assertEquals(
            "The two points cannot be the same.",
            exception.message
        )
    }

    // Rectangle Class Tests
    @Test
    fun `Test Rectangle Class Methods`() {
        val pointOne = Point(1.0, 2.0)
        val pointTwo = Point(3.0, 4.0)
        val rectangle = Rectangle(pointOne, pointTwo)
        
        // Test the points of the rectangle
        assertEquals(pointOne, rectangle.GetPointOne())
        assertEquals(pointTwo, rectangle.GetPointTwo())

        // Test the area of the rectangle
        val rectangleArea = rectangle.GetArea()
        val expectedArea = Math.abs((pointTwo.GetX() - pointOne.GetX()) * (pointTwo.GetY() - pointOne.GetY()))
        assertEquals(expectedArea, rectangleArea)

        // Test the MoveRectangle method
        rectangle.MoveRectangle(1.0, 1.0);
        assertEquals(pointOne.GetX(),2.0)
        assertEquals(pointOne.GetY(),3.0)
        assertEquals(pointTwo.GetX(),4.0)
        assertEquals(pointTwo.GetY(),5.0)
    }

    // Rectangle Class Tests Rejected Inputs

    @Test
    fun `Rectangle with zero area throws exception`() {
        val exception = assertFailsWith<IllegalArgumentException> {
        Rectangle(
            Point(1.0, 2.0),
            Point(1.0, 5.0)
        )
    }

    assertEquals(
        "The two points cannot be the same.",
        exception.message
    )
    }

    // Square Class Tests

    @Test
    fun `Test Square Class Methods`() {
        val pointOne = Point(1.0, 2.0)
        val square = Square(pointOne)
        val pointTwo = square.GetPointTwo()

        // Test the points of the square
        assertEquals(square.GetPointOne().GetX(), 1.0)
        assertEquals(square.GetPointOne().GetY(), 2.0)
        assertEquals(pointTwo.GetX(), 2.0)
        assertEquals(pointTwo.GetY(), 0.0)

        // Test the area of the square
        val squareArea = square.GetArea()
        val expectedArea = Math.abs((pointTwo.GetX() - pointOne.GetX()) * (pointTwo.GetY() - pointOne.GetY()))
        assertEquals(expectedArea, squareArea)

        // Test the MoveSquare method
        square.MoveSquare(1.0, 1.0);
        assertEquals(pointOne.GetX(),2.0)
        assertEquals(pointOne.GetY(),3.0)
        assertEquals(pointTwo.GetX(),3.0)
        assertEquals(pointTwo.GetY(),1.0)
    }

    // Triangle Class Tests

  @Test
    fun `Test Triangle Class Methods`() {
        val pointOne = Point(0.0, 0.0)
        val pointTwo = Point(4.0, 0.0)
        val pointThree = Point(0.0, 3.0)

        val triangle = Triangle(pointOne, pointTwo, pointThree)

        // Test the points of the triangle
        assertEquals(pointOne, triangle.GetPointOne())
        assertEquals(pointTwo, triangle.GetPointTwo())
        assertEquals(pointThree, triangle.GetPointThree())

        // Test the area of the triangle
        val triangleArea = triangle.GetArea()
        val expectedArea = 6.0

        assertEquals(expectedArea, triangleArea)

        // Test the MoveTriangle method
        triangle.MoveTriangle(1.0, 1.0)

        assertEquals(1.0, pointOne.GetX())
        assertEquals(1.0, pointOne.GetY())

        assertEquals(5.0, pointTwo.GetX())
        assertEquals(1.0, pointTwo.GetY())

        assertEquals(1.0, pointThree.GetX())
        assertEquals(4.0, pointThree.GetY())
}

    // Triangle Class Tests Rejected Inputs

    @Test
    fun `Triangle with zero area throws exception`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            Triangle(
                Point(0.0, 0.0),
                Point(1.0, 1.0),
                Point(2.0, 2.0)
            )
        }

        assertEquals(
            "Area cannot be 0",
            exception.message
        )
    }


    // Circle Class Tests

    @Test
    fun `Test Circle Class Methods`() {
        val middlePoint = Point(1.0, 2.0)
        val radius = 3.0
        val circle = Circle(middlePoint, radius)

        // Test the middle point and radius of the circle
        assertEquals(middlePoint, circle.GetMiddlePoint())
        assertEquals(radius, circle.GetRadiusOne())
        assertEquals(radius, circle.GetRadiusTwo())

        // Test the area of the circle
        val circleArea = circle.GetArea()
        val expectedArea = Math.PI * radius * radius
        assertEquals(expectedArea, circleArea)

        // Test the MoveCircle method
        circle.MoveCircle(1.0, 1.0);
        assertEquals(middlePoint.GetX(),2.0)
        assertEquals(middlePoint.GetY(),3.0)
    }

    // Circle Class Tests Rejected Inputs
    @Test
    fun `Circle with negative or zero radius throws exception`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            Circle(Point(1.0, 2.0), -3.0)
        }

        assertEquals(
            "Radius cannot be negative or 0",
            exception.message
        )

        val exception2 = assertFailsWith<IllegalArgumentException> {
            Circle(
                Point(1.0, 2.0),
                0.0
            )
        }

        assertEquals(
            "Radius cannot be negative or 0",
            exception2.message
        )
    }

    // Ellipse Class Tests

    @Test
    fun `Test Ellipse Class Methods`() {
        val middlePoint = Point(1.0, 2.0)
        val radiusOne = 3.0
        val radiusTwo = 4.0
        val ellipse = Ellipse(middlePoint, radiusOne, radiusTwo)

        // Test the middle point and radii of the ellipse
        assertEquals(middlePoint, ellipse.GetMiddlePoint())
        assertEquals(radiusOne, ellipse.GetRadiusOne())
        assertEquals(radiusTwo, ellipse.GetRadiusTwo())

        // Test the area of the ellipse
        val ellipseArea = ellipse.GetArea()
        val expectedArea = Math.PI * radiusOne * radiusTwo
        assertEquals(expectedArea, ellipseArea)

        // Test the MoveEllipse method
        ellipse.MoveEllipse(1.0, 1.0);
        assertEquals(middlePoint.GetX(),2.0)
        assertEquals(middlePoint.GetY(),3.0)
    }


    // Ellipse Class Tests Rejected Inputs

    @Test
    fun `Ellipse with negative or zero radii throws exception`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(1.0, 2.0), -3.0, 4.0)
        }

        assertEquals(
            "Radii cannot be negative or 0",
            exception.message
        )

        val exception2 = assertFailsWith<IllegalArgumentException> {
            Ellipse(
                Point(1.0, 2.0),
                3.0,
                -4.0
            )
        }

        assertEquals(
            "Radii cannot be negative or 0",
            exception2.message
        )

        val exception3 = assertFailsWith<IllegalArgumentException> {
            Ellipse(
                Point(1.0, 2.0),
                0.0,
                4.0
            )
        }

        assertEquals(
            "Radii cannot be negative or 0",
            exception3.message
        )

        val exception4 = assertFailsWith<IllegalArgumentException> {
            Ellipse(
                Point(1.0, 2.0),
                3.0,
                0.0
            )
        }

        assertEquals(
            "Radii cannot be negative or 0",
            exception4.message
        )
    }


}