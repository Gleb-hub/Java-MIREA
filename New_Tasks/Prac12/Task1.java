import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Task1 extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 20; i++) {
            if(Math.random() > 0.5) {
                drawRect(g);
            }
            else {
                drawOval(g);
            }
        }
    }
    public void drawRect(Graphics g) {
        Rectangle a = new Rectangle();
        g.setColor(a.getColor());
        g.fillRect(a.getX(), a.getY(), a.getWidth(), a.getHeight());
    }
    
    public void drawOval(Graphics g) {
        Oval a = new Oval();
        g.setColor(a.getColor());
        g.fillOval(a.getX(), a.getY(), a.getRadius() * 2, a.getRadius() * 2);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().add(new Task1());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.setVisible(true);
    }
}

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    Shape() {
        color = Color.BLACK;
        this.x = 0;
        this.y = 0;
    }

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

}

class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle() {
        this.x = (int) (Math.random() * 100);
        this.y = (int) (Math.random() * 100);
        this.width = (int) (Math.random() * 20);
        this.height = (int) (Math.random() * 20);
        this.color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }
    public int getWidth() {
        return width;
    }  

    public int getHeight() {
        return height;
    }  

    public int getX() {
        return x;
    }  

    public int getY() {
        return y;
    }  

    public Color getColor() {
        return color;
    }  

}

class Oval extends Shape{
    private int radius;
    
    public Oval() {
        this.x = (int) (Math.random() * 100);
        this.y = (int) (Math.random() * 100);
        this.radius = (int) (Math.random() * 20);
        this.color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }  

    public int getY() {
        return y;
    }  

    public Color getColor() {
        return color;
    }  



}
