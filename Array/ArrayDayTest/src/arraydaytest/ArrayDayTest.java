
package arraydaytest;

import java.util.Scanner;


public class ArrayDayTest {

  
    public static void main(String[] args) {
        System.out.println("Pls enter nuber day in digit");
        Scanner input=new Scanner(System.in);
        int userInputNumber=input.nextInt();
        
        String[]weekDays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        System.out.println(weekDays[userInputNumber]);
        
        
        
        
        
    }
    
}
