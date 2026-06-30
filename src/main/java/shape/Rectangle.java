package shape;

public class Rectangle {
    private Point pointOne;
    private Point pointTwo;

    public Rectangle(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;

        // Check if the area is 0, if so throw an exception
        double area = Math.abs(pointTwo.GetX() - pointOne.GetX()) * Math.abs(pointTwo.GetY() - pointOne.GetY());
        if (area <= 0) {
            throw new IllegalArgumentException("The two points cannot be the same.");
        }
    }

    public Point GetPointOne() {
        return pointOne;
    }
    public Point GetPointTwo() {
        return pointTwo;
    }
    public double GetArea() {
        double area = Math.abs(pointTwo.GetX() - pointOne.GetX()) * Math.abs(pointTwo.GetY() - pointOne.GetY());
        return area;
    }

    public void MoveRectangle(double addXvalue, double addYvalue) {
        pointOne.MovePoint(addXvalue, addYvalue);
        pointTwo.MovePoint(addXvalue, addYvalue);
    }
}