
package computechange;

import java.util.Scanner;


public class ComputeChange {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Pls enter a amount  like 11.56 ");
        
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        int numberOfOneDollars = remainingAmount / 100;  // remainingAmount=1156
        // numberOfOneDollars = $ 11
        
        remainingAmount=remainingAmount%100; // remainingAmount = 56
        
        int numberOfQuarters = remainingAmount / 25;  //numberOfQuarters = 2 
        
        remainingAmount=remainingAmount%25; // remainingAmount = 6
        
        int noOfDimes=remainingAmount/10; // remainingAmount = 6
        
        remainingAmount=remainingAmount%10; // remainingAmount = 6
        
        int numberOfNickels = remainingAmount / 5; //numberOfNickels = 1
        remainingAmount = remainingAmount % 5;  // remainingAmount = 1
        
        System.out.println(remainingAmount);
        
    }
    
}
