
public class Task4 {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println(mc1.pow(2, 10));

    }
}

interface MathCalculable {
    public double PI = Math.PI;

    public double pow(double a, double n);

    public double absc(double re, double im);
}

class MathFunc implements MathCalculable {

    public double pow(double a, double n) {
        return Math.pow(a, n);
    }

    public double absc(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

}
