public class TestBall{
    public static void main(String[] args) {
        Ball test = new Ball(1.2, 1.3);    

        System.out.println(test.toString());
        test.move(2, 4);
        System.out.println(test.toString());
    }
}


class Ball{
    private double x;
    private double y;
    
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        x = 0;
        y = 0;
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

   public void setXY(double x, double y) {
       this.x = x;
       this.y = y;
   }

   public void move (double xDisp, double yDisp) {
       this.x += xDisp;
       this.y += yDisp;
   }

   @Override 
   public String toString() {
       return "Ball{" + 
           "x=" + x + 
           " y=" + y + 
           "}";
   }
}
