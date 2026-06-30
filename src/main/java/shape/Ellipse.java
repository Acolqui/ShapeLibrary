package shape;
public class Ellipse {
    private Point middlePoint;
    private double radiusOne;
    private double radiusTwo;

    public Ellipse(Point middlePoint, double radiusOne, double radiusTwo) {
        this.middlePoint = middlePoint;
        this.radiusOne = radiusOne;
        this.radiusTwo = radiusTwo;

        // Check if the area is 0, if so throw an exception
        double area = Math.PI * radiusOne * radiusTwo;
        if (area <= 0) {
            throw new IllegalArgumentException("Radii cannot be negative or 0");
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

    public void MoveEllipse(double addXvalue, double addYvalue) {
        middlePoint.MovePoint(addXvalue, addYvalue);
    }
}