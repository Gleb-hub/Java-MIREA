// Перевод числа из 10ти ричной в любую другую
// На ввод 2 числа
// 1. double число
// 2. система счисления в которую переводят
// подсказка: ограничить вывод до 3х знаков после запятой
// доп вывод в 2чной и 16тиричной
import java.util.Scanner;

public class Task6 {
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double num = sc.nextDouble();
    int base = sc.nextInt();
  
    System.out.println("В " + base + ": " + convert_base(num, base));
    System.out.println("В 2: " + convert_base(num, 2));
    System.out.println("B 16: " + convert_base(num, 16));
  }

  private static String convert_base (double num, Integer to_base) {
    String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String res = "";
  
    int intPart = (int) num;
    double doublePart = num - intPart;

    int mod = 0;
    while (intPart > 0) {
      mod = intPart%to_base;
      intPart = intPart / to_base;
      res += alphabet.charAt(mod);
    }

    StringBuilder sb=new StringBuilder(res);  
    sb.reverse();
    res = sb.toString();
    res += "."; 

    for (int i = 0; i < 3; i++) {
      
      int x = (int) (doublePart * to_base);
      if (x == 1){
        res += alphabet.charAt(x);
        break;
      }
      else {
        res += alphabet.charAt(x);
      }
      doublePart = doublePart*to_base - x;
    }

    return res;

  }
}

