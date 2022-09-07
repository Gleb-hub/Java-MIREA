// Выводит первые 10 элементов гармонического ряда до 2 знаков после запятой и сумма 10ти эллементов


public class Task2 {
    public static void main (String[] args) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            double x =  1./(i+1);
            System.out.printf("%.2f ", x);
            sum += x;

        }
        System.out.printf("\nSum: %.2f", sum);
    }
}
