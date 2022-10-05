import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random rg = new Random();

        int[] arr;
        arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = rg.nextInt() % 90 + 10;
            System.out.printf("%d ", arr[i]);
        }

        int prev = arr[0];
        for (int i = 1; i < 4; i++) {
            if (prev <= arr[i]) {
                System.out.println("\nМассив НЕ строго возрастающий!");
                return;
            }
            prev = arr[i];
        }
        System.out.println("\nМассив строго возрастает!");
    }
}
