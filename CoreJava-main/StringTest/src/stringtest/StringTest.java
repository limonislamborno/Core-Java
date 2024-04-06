package stringtest;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        // Find max number from three(3) number
        System.out.println("Pls enter 1st number ");
        int number1=input.nextInt();
        System.out.println("Pls enter 2nd number ");
        int number2=input.nextInt();
        System.out.println("Pls enter 3rd number ");
        int number3=input.nextInt();
        
        int maxNumber=0, minNumber=0;
        
        if(number1 > number2 && number1 > number3){
            maxNumber=number1;
        }
        else if(number2 > number1 && number2 > number3){
            maxNumber=number2;
        }
        else{
            maxNumber=number3;
        }
        
         // Find min number from three(3) number
        if(number1 < number2 && number1 < number3){
            minNumber=number1;
        }
        else if(number2 < number1 && number2 < number3){
            minNumber=number2;
        }
        else{
            minNumber=number3;
        }
        
        System.out.println("Max number = "+maxNumber); 
        System.out.println("Min number = "+minNumber); 
   }

}
