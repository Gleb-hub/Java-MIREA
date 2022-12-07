import java.util.*;

public class Task1256 {
    public static void main(String[] args) {
        method1("I like Java!");
        method2("I like Java!");
        method5("I like Java!");
        method6("I like Java!!!");
    }

    public static void method1(String str) {
        System.out.println(str);
    }

    public static void method2(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static void method5(String str) {
        System.out.println(str.contains("Java"));
    }

    public static void method6(String str) {
        System.out.println(str.indexOf("Java"));
    }

}
