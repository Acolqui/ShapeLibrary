package shape;

public class Point {

    private double x;
    private double y;

     public Point(double x, double y) {
        this.x = x;
        this.y = y;
     }

     public double GetX() {
         return x;
     }

     public double GetY() {
         return y;
     }

     public Point Clone() {
         return new Point(x, y);
     }

     public void MovePoint(double addXvalue , double addYvalue) {
         this.x += addXvalue;
         this.y += addYvalue;
     }

}