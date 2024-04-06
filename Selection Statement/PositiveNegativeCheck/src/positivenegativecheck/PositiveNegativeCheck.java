
package positivenegativecheck;

import java.util.Scanner;


public class PositiveNegativeCheck {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Pls enter number");
        int number=sc.nextInt();
        
        if(number>0){
            System.out.println("Positive number");
        }
        else if(number<0){
        System.out.println("Negative number");
        
        }
        else{
            System.out.println("Number is equal to zero");
        }
        
   
        
    }
    
}
