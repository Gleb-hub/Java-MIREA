import java.util.*;
import java.text.SimpleDateFormat;

public class Task2 {
    public static void main(String[] args) {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        if (new Date().getTime() > System.currentTimeMillis()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
