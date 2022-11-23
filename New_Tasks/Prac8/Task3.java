
public class Task3 {
    public static void main(String[] args) {

        int a = 1;
        int b = 12;

        recursion(a, b);
    }

    public static int recursion(int a, int b) {

        if (a == b) {
            System.out.println(a);
            return 1;
        } else if (a > b) {
            System.out.println(b);
            return recursion(a, b + 1);
        } else {
            System.out.println(a);
            return recursion(a + 1, b);
        }
    }
}
