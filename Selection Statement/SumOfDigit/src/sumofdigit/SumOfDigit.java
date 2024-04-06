
package sumofdigit;

import java.util.Scanner;


public class SumOfDigit {

   
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        
        System.out.println("Pls enter a number between 0-999 ");
        
        int number= in.nextInt();
        
    int firstDigit=0;
    int secondDigit=0;
    int thirtdDigit=0;
    int forthDigit=0;
    int reminder=0;
    int result=0;
    
    if(number<999 && number >0){
            firstDigit = number /100;
            reminder =number % 100;
            
            secondDigit = reminder /10;
            reminder =reminder % 10;            
            
                     
           result = firstDigit+secondDigit+reminder;
           
            System.out.println("Sum = " + result);    
                        
        }
    
        
    else if(number<9999 && number >0){
            firstDigit = number /1000;
            reminder =number % 1000;
            
            secondDigit = reminder /100;
            reminder =reminder % 100;
            
            thirtdDigit = reminder /10;
            reminder =reminder % 10;
                     
           result = firstDigit+secondDigit+thirtdDigit+reminder;
           
            System.out.println("Sum = " + result);    
                        
        }        
       
        
//        int fisrtDigit= number / 100 ; 
//        int reminder= number % 100 ;
//        
//        int secondDigit= reminder / 10 ;
//        reminder = reminder % 10; 
//         
//        int result = fisrtDigit+secondDigit+reminder;
//        
//        System.out.println( result);
        
    }
    
}
