
package stringtest;

import java.util.Scanner;


public class FindPrimeNUmber {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int userInput=input.nextInt();
        
        int count=0;        
        for(int i=1; i<=userInput; i++){
            if(userInput %i==0){
                count +=1;
            }
        }
        // end for loop
        
        if(count==2){
            System.out.println("This is prime number "); 
       }
        else{
            System.out.println("This is not prime number ");
        }
        
    }
}
