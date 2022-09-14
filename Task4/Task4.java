// Разработать программу принимающую на вход 
// 1. индекс 'отсчет с единицы' числа фиббоначи 
// 2. кол-во чисел которые ты хочешь вывести
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int len = sc.nextInt();
    x--;
    

    int fib1 = 0;
    int fib2  = 1;
    
    for (int i = 0; i < x + len; i++) {
      int fib = fib1 + fib2;
      
      if (i >= x) {
        System.out.printf("%d ", fib);
      }


      if (i == 0) {
        fib1 = 0;
      }
      else {
        fib1 = fib2;
      }

      fib2 = fib;
    }
    
    System.out.println("\n");
  }
}
