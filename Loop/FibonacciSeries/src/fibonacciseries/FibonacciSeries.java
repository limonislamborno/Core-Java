
package fibonacciseries;

import java.util.Scanner;


public class FibonacciSeries {

    
    public static void main(String[] args) {
       
         Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter number of fibonacci series");
        int number = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.println("Result is ");
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i <= number; i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;

        }
    }
    
}
