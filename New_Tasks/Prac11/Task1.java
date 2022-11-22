import java.util.*;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {

        String secondName = "Nechaev";
        System.out.println(secondName);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");

        Calendar calendar = new GregorianCalendar(2022, 10, 16, 16, 20);
        Date taskTime = calendar.getTime();
        System.out.println(dateFormatter.format(taskTime));
        System.out.println(dateFormatter.format(new Date().getTime()));
    }
}
