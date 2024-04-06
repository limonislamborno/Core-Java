
package primecheck;

import java.util.Scanner;


public class PrimeCheck {

   
    public static void main(String[] args) {
     
       Scanner input = new Scanner(System.in);

        System.out.println("Pls eneter a number for check prime");
        int number = input.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }

        }

        if (count == 2) {
            System.out.println("Its a prime number");
        } else {
            System.out.println("Its not a prime number");

        }
    }
    
}
