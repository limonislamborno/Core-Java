
package calculationtest;

import java.util.Scanner;


public class CalculationTest {

    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        
        System.out.println("Pls enter price ");
        double price=input.nextDouble();
        
        System.out.println("Pls enter Tax rate ");
        double tax=input.nextDouble();
        
        //double taxRate=tax/100;
        
        double actualPrice= price+ price*(tax/100);       
     //   double actualPrice= price+ (price*taxRate);       
        
         System.out.println("Actual price is "+ actualPrice);       
        
        
    }
    
}
