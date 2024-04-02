
package terneryoperatortest;

import java.util.Scanner;


public class TerneryOperatorTest {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter number");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        
        int largeNumber=(number1>number2)? number1:number2;     //ternary operator
        System.out.println("Large number is "+largeNumber);

        
    }
    
}
