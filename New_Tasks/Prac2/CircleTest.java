public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(0, 0, 10);
        Circle b = new Circle(1, 1, 10);

        System.out.println("Circle a: " + a.toString());
        System.out.println("Circle b: " + b.toString());
        System.out.println("Result of comparition of Circle a and Circle b: " + a.compareTo(b));

        Point cCenter = new Point(1.234, 5.678);
        Circle c = new Circle(cCenter, 3);

        System.out.println("\nCircle c: " + c.toString());
        System.out.println("Circle perimetr: " + c.getPerimetr() + "\nCircle area:" + c.getArea());
    }
}

class Point {
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

class Circle {
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

    public Point getP() {
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

    public double getPerimetr() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r / 2;
    }

    public int compareTo(Circle b) {
        if (r > b.getR()) {
            return 1;
        } else if (r < b.getR()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                p.toString() +
                " r=" + r +
                "}";
    }
}
