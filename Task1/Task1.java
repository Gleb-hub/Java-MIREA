// Нужно разработать программу которая будет считать сумму элементов массива интов с помощью for, while, do while
// На ввод получает кол-во элементов массива и сами элементы массива
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Task1 {
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Integer> MyArray = new ArrayList<>();


    for (int i = 0; i < n; i++) {
      MyArray.add(sc.nextInt());
    }


    int sum = 0;
    
    for (int i = 0; i < n; i++) {
      sum += MyArray.get(i);
    }
    
    System.out.printf("For Sum: %d\n", sum);


    int i = 0;
    sum = 0;

    while (i < n) {
      sum +=  MyArray.get(i);
      i++;
    }
    
    System.out.printf("While Sum: %d\n", sum);


    i = 0;
    sum = 0;

    do {
      sum +=  MyArray.get(i);
      i++;
    } while (i < n);
    
    System.out.printf("Do While Sum: %d\n", sum);
  }
  

  //Мини бонус :)
  public static void HelloWorld () {
    System.out.println("Hello world!");
  }
}
