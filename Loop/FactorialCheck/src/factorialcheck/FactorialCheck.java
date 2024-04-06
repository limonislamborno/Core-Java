
package factorialcheck;

import java.util.Scanner;


public class FactorialCheck {

  
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Pls enter number for factorial result");
        int number=input.nextInt();
        int factorial=1;
        
        for(int i=number; i>=1; i--){
            factorial*=i;
        
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
    
}
