package shape;

public class Circle {
    private Point middlePoint;
    private double radiusOne;
    private double radiusTwo;

    public Circle(Point middlePoint, double radiusOne) {
        this.middlePoint = middlePoint;
        this.radiusOne = radiusOne;
        this.radiusTwo = radiusOne;

        if (radiusOne <= 0) {
            throw new IllegalArgumentException("Radius cannot be negative or 0");
        }
    }

    public Point GetMiddlePoint() {
        return middlePoint;
    }
    public double GetRadiusOne() {
        return radiusOne;
    }
    public double GetRadiusTwo() {
        return radiusTwo;
    }
    public double GetArea() {
        double area = Math.PI * radiusOne * radiusTwo;
        return area;
    }

    public void MoveCircle(double addXvalue, double addYvalue) {
        middlePoint.MovePoint(addXvalue, addYvalue);
    }
}