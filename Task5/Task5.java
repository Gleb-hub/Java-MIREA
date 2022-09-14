// Написать программу удаления значений из массива на вход 3 числа
// Значения варьируются от 0 до 100
// 1. длинна
// 2. число для удаления
// 3. числа кончающиеся на эту цифру удаляем
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Task5 {
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    final Random rg = new Random();

    List<Integer> Array = new ArrayList<>();

    
    int len = sc.nextInt();
    
    for (int i = 0; i < len; i++) {
      Array.add(rg.nextInt(100));
      System.out.printf("%d ", Array.get(i));
    }

    System.out.printf("\nКол-во эллементов:%d\n", Array.size());
    

    int x = sc.nextInt();

    Array.removeAll(Arrays.asList(x));

    for (int i = 0; i < Array.size(); i++) {
      System.out.printf("%d ", Array.get(i));
    }

    System.out.printf("\nКол-во эллементов:%d\n", Array.size());

    
    x = sc.nextInt();

    for (int i = 0; i < Array.size(); i++) {
      if (Array.get(i)%10 == x) {
        Array.remove(i);
        i--;
      }
    }
    
    for (int i = 0; i < Array.size(); i++) {
      System.out.printf("%d ", Array.get(i));
    }

    System.out.printf("\nКол-во эллементов:%d\n", Array.size());
    

    System.out.printf("\n");
  }  
}
