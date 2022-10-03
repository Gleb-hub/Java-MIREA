import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        String words = in.nextLine();
        
        StringTokenizer st = new StringTokenizer(words);
        int counter = 0;

        System.out.println("Words sum: " + st.countTokens());
    }
}
