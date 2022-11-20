
public class Task2 {
    public static void main(String[] args) {

        int n = 10;
        recursion(n);
    }

    public static int recursion(int n) {

        System.out.println(n);
        if (n == 1) {
            return 1;
        }

        return recursion(n - 1);
    }
}
