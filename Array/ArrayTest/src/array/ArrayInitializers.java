package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitializers {

    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=in.nextInt();
        int sum=0;
        
        int[] numbers=new int[size];
        
        for(int i=0; i<numbers.length; i++){
            numbers[i]=(int)(Math.random()*100);                
        }
        int max=numbers[0];
        int min=numbers[0];
                
        for(int number:numbers){ 
            
            max= number > max ? number : max ;
            min= number < min ? number : min;           
        }
        
        System.out.println(Arrays.toString(numbers));        
        System.out.println("Max no is= "+max+ " Min no is= "+min);
        
        
        
        
    }

    
    
    
}
