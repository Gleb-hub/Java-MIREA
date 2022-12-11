import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1357 {
    public static void main(String[] args) {
        task1(args);
        task3("25.98 USD");
        task3("44 ERR");
        task5("29/02/2000");
        task5("30-04-2003");
        task7("smart_pass");
        task7("F032_Password");
    }

    public static void task1(String[] args) {
        for (String word : args[0].split(args[1])) {
            System.out.println(word);
        }
    }

    public static void task3(String str) {
        Pattern p = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(str + " " + m.find());
        }
    }

    public static void task5(String str) {
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))")
                .matcher(str);

        System.out.println(m.find() && m.group().equals(str));
    }

    public static void task7(String str) {
        System.out.println(Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(str).find());
    }

}
