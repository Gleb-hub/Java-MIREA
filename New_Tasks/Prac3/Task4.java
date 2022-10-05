import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rg = new Random();

        int n = 0;

        do {
            // System.out.print("\033[H\033[J");
            System.out.println("Введите длину массива: ");
            n = sc.nextInt();

        } while (n <= 0);

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(rg.nextInt() % (n + 1));
        }
        System.out.println("Массив: " + array);

        List<Integer> even_array = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0 && array.get(i) != 0) {
                even_array.add(array.get(i));
            }
        }

        if (even_array.isEmpty()) {
            System.out.println("В массиве нет четных элементов");
        } else {
            System.out.println("Массив четных элементов: " + even_array);
        }
    }
}
