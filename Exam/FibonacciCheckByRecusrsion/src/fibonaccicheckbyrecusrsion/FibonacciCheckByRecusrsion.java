package fibonaccicheckbyrecusrsion;

import java.util.Scanner;

public class FibonacciCheckByRecusrsion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number for fibonacci position check");
        int number = sc.nextInt();
        long result = fibonacci(number);
        System.out.println("Fibonacci position  " + number + " is " + result);

    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }  else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }


}
