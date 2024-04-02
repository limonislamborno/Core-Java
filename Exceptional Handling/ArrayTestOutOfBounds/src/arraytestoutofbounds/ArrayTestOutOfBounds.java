
package arraytestoutofbounds;

import java.util.Scanner;


public class ArrayTestOutOfBounds {

    
    public static void main(String[] args) {
        int[] myArray=new int[100];
        
        for(int i=0; i<myArray.length; i++){
            myArray[i]=(int) (Math.random()*100);
          
        }
        
        System.out.println("Pls enter index number of array");
        Scanner sc =new Scanner (System.in);    
        int userInput=sc.nextInt();
        
        try {
            int value=myArray[userInput];
            System.out.println("Index of "+userInput+" no Value is "+value);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds");
        }
        
        
        
        
        
    }
    
}
