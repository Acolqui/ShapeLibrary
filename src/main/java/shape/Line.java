package shape;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;


        // Check if the lenght is 0, if so throw an exception
        if (pointOne.GetX() == pointTwo.GetX() && pointOne.GetY() == pointTwo.GetY()) {
            throw new IllegalArgumentException("The two points cannot be the same.");
        }
    }

    public Point GetPointOne() {
        return pointOne;
    }

    public Point GetPointTwo() {
        return pointTwo;
    }

    public double GetSlope() {
        double slope = (pointTwo.GetY() - pointOne.GetY()) / (pointTwo.GetX() - pointOne.GetX());
        return slope;
    }

    public double GetLength() {
        double length = Math.sqrt(Math.pow(pointTwo.GetX() - pointOne.GetX(), 2) + Math.pow(pointTwo.GetY() - pointOne.GetY(), 2));
        return length;
    }

    public void MoveLine(double addXvalue, double addYvalue) {
        pointOne.MovePoint(addXvalue, addYvalue);
        pointTwo.MovePoint(addXvalue, addYvalue);
    }
}