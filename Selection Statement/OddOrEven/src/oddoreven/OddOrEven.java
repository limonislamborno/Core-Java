
package oddoreven;

import java.util.Scanner;


public class OddOrEven {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number to check odd or even number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");

        } else {
            System.out.println("Odd Number");

        }
    }
    
}
