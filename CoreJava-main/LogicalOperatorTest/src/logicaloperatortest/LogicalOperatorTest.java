
package logicaloperatortest;

import java.util.Scanner;


public class LogicalOperatorTest {

 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
               
        int guessNumber= (int)(Math.random()*10);
        //System.out.println(guessNumber);
        int counter=1;
        
        do{
            System.out.println("Pls enter ur guess number "); 
            int userInput=input.nextInt();
            if(guessNumber==userInput){
                System.out.println("Hurray You win");
                break;
            }
            else{
                System.out.println("Pls try again ");
            }
            
            counter++;
        }
        while(counter<=5);
        System.out.println("Batter luck next time ");
        System.out.println("The number is "+ guessNumber);
        
    }
    
}
