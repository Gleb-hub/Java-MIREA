import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        method1("I like Java!");
        method2("I like Java!");
        method5("I like Java!");
        method6("I like Java!!!");
        method7("I like Java!!!");
        method8("I like Java!!!");
        method9("I like Java!!!");
        method10("I like Java!!!");
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
    
    public static void method3(String str) {
        System.out.println(str.endsWith("!!!"));
    }
    
    public static void method4(String str) {
        System.out.println(str.startsWith("I like"));
    }
    
    public static void method7(String str) {
        System.out.println(str.replace('a','o'));
    }
     
    public static void method8(String str) {
        System.out.println(str.toUpperCase());
    }
     
    public static void method9(String str) {
        System.out.println(str.toLowerCase());
    }
      
    public static void method10(String str) {
        System.out.println(str.substring(4, 8));
    }
   

}
