
// Генерирует 10 эл-ов массива double двумя способами:
// 1. util.Random 
// 2. Math.random
// вывести, отсортировать, вывести
import java.util.Comparator;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        List<Double> MathRArray = new ArrayList<>();
        List<Double> UtilRArray = new ArrayList<>();

        final Random rg = new Random();

        for (int i = 0; i < 10; i++) {
            MathRArray.add(Math.random());
            UtilRArray.add(rg.nextDouble());
        }

        System.out.print("Math.Random Array:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%f ", MathRArray.get(i));
        }

        System.out.print("\nutil.Random Array:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%f ", UtilRArray.get(i));
        }

        MathRArray.sort(Comparator.naturalOrder());
        UtilRArray.sort(Comparator.naturalOrder());

        System.out.print("\n\nMath.Random Array SORTED:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%f ", MathRArray.get(i));
        }

        System.out.print("\nutil.Random Array SORTED:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%f ", UtilRArray.get(i));
        }
        System.out.print("\n");
    }
}
