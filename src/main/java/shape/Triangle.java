package shape;

public class Triangle {
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;

    public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;

        //Check if the traingle is valid by having area greater than 0, if not throw an exception
        double area = 0.5 * Math.abs(pointOne.GetX() * (pointTwo.GetY() - pointThree.GetY()) + pointTwo.GetX() * (pointThree.GetY() - pointOne.GetY()) + pointThree.GetX() * (pointOne.GetY() - pointTwo.GetY()));
        if (area <= 0) {
            throw new IllegalArgumentException("Area cannot be 0");
        }
        
    }

    public Point GetPointOne() {
        return pointOne;
    }

    public Point GetPointTwo() {
        return pointTwo;
    }

    public Point GetPointThree() {
        return pointThree;
    }

    public double GetArea() {
        double area = 0.5 * Math.abs(pointOne.GetX() * (pointTwo.GetY() - pointThree.GetY()) + pointTwo.GetX() * (pointThree.GetY() - pointOne.GetY()) + pointThree.GetX() * (pointOne.GetY() - pointTwo.GetY()));
        return area;
    }

    public void MoveTriangle(double addXvalue, double addYvalue) {
        pointOne.MovePoint(addXvalue, addYvalue);
        pointTwo.MovePoint(addXvalue, addYvalue);
        pointThree.MovePoint(addXvalue, addYvalue);
    }
}