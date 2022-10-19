
public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(0, 10);
        Shape rectangle = new Rectangle(3, 4, 5);
        Shape square = new Square(10);

        System.out.println(circle.getType() + " " + circle);
        System.out.println(circle.getType() + " " + circle.getPerimetr());
        System.out.println(circle.getType() + " " + circle.getArea());
        
        System.out.println(rectangle.getType() + " " + rectangle);
        System.out.println(rectangle.getType() + " " + rectangle.getPerimetr());
        System.out.println(rectangle.getType() + " " + rectangle.getArea());
        
        System.out.println(square.getType() + " " + square);
        System.out.println(square.getType() + " " + square.getPerimetr());
        System.out.println(square.getType() + " " + square.getArea());
    }
}

abstract class Shape {
    abstract String getType();
    abstract double getPerimetr();
    abstract double getArea();
}

class Circle extends Shape {
    private double center;
    private double radius;

    public Circle(double center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public String getType() {
        return "Circle";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "(center: " + center + ",radius: " + radius + ")";
    }
}

class Rectangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Rectangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        double hp = getPerimetr() / 2.;
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
    }

    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "(a: " + a + ",b: " + b + ",c: " + c + ")";
    }
}

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getType() {
        return "Square";
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimetr() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "(a: " + a + ")";
    }
}
