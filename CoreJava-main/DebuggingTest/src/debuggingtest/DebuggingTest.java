package debuggingtest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DebuggingTest {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        
        String name= in.next();
        
//        System.out.println("Hello "+name);
        
        
//        if (name.equalsIgnoreCase("Hello")){
//            System.out.println("+++++++");
//        }
//        else{
//        System.out.println("--------");
//        }
        
        
//        char ch = in.next().charAt(0);
//
//        if (ch >= (char) 65 && ch <= (char) 90) {
//            System.out.println("Uppaer Case");
//            System.out.println((int) ch);
//            System.out.println(Integer.toBinaryString((int) ch));
//        } else {
//            System.out.println("Lower Case");
//            System.out.println((int) ch);
//            System.out.println(Integer.toBinaryString((int) ch));
//        }
//        String name = " Java  World";
//        System.out.println(name.length());
////        System.out.println(name.charAt(0));
//        String trim=name.trim();
////        System.out.println(trim.length());
//
        System.out.println(name.substring(5));
       

    }

}
