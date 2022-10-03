import java.util.ArrayList;
import java.util.List;


public class Tester{
    public static void main(String[] args) {
        len = 10;

        for (int i = 0; i < len; i++) {
            Circles.add(new Circle(new Point(i, i), 4));
            System.out.println(Circles.get(i).toString());
        }
    }
   
    private static List<Circle> Circles = new ArrayList<>();
    private static int len;
}


class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    } 

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + 
            "x=" + x +
            " y=" + y + 
            "}";
    }
}


class Circle{
    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }
    
    public Circle(double x, double y, double r) {
        this.p = new Point(x, y);
        this.r = r;
    }

    public double getX() {
        return p.getX();
    }

    public void setX(double x) {
        p.setX(x);
    }

    public double getY() {
        return p.getY();
    }

    public void setY(double y) {
        p.setY(y);
    }

    public void setXY(double x, double y) {
        p.setX(x);
        p.setY(y);
    }

    public Point getP(){
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
            p.toString() +
            " r=" + r +
            "}";
    }
}

