import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Task {
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Integer> MyArray = new ArrayList<>();

    int sum = 0;

    for (int i = 0; i < n; i++) {
      MyArray.add(sc.nextInt());
      sum+= MyArray.at(i);
    }
    System.out.printf("Sum: %d\nAvarage: %f\n", sum, Double(sum)/MyArray.length());
  }
}

