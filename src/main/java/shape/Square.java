package shape;

public class Square{
    private Point pointOne;
    private Point pointTwo;

    public Square(Point pointOne) {
        this.pointOne = pointOne;
        
        //Set point two to opposite corner of the square by cloning point one and moving it x and y values to be the opposite corner of the square
        this.pointTwo = pointOne.Clone();
        this.pointTwo.MovePoint(pointOne.GetX(), -pointOne.GetY());

        
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

    public void MoveSquare(double addXvalue, double addYvalue) {
        pointOne.MovePoint(addXvalue, addYvalue);
        pointTwo.MovePoint(addXvalue, addYvalue);
    }
}