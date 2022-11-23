import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date, hours, minutes);

        Date nDate = new Date(year, month, date, hours, minutes);

        System.out.println(nDate);
        System.out.println(cal);

    }
}
