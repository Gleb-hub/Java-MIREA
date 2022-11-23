import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        int k = 3;
        int i = (int) Math.pow(10, k - 1);
        int scount = 0;
        System.out.println(recursion(k, 27, i, scount));
    }

    public static int recursion(int k, int s, int i, int scount) {

        if (i == (int) Math.pow(10, k)) {
            return scount;
        }

        int ssum = 0;
        int num = i;

        while (num != 0) {
            ssum += num % 10;
            num /= 10;

        }

        if (ssum == s) {
            System.out.println(i);
            scount += 1;
        }

        return recursion(k, s, i + 1, scount);
    }
}
