
package multi;

import java.util.Scanner;


public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        int [] [] multiArray=new int [3] [5];
        System.out.println("Pls enter number");
        for(int row=0; row<3; row++){
                for(int col=0; col<5; col++){
                    System.out.printf("multiArray [%d][%d]=",row,col);
                    multiArray [row] [col] =sc.nextInt();
                }
                
        
        }
        
        for(int row=0; row<3; row++){
                for(int col=0; col<5; col++){
                    
                    System.out.print(" "+multiArray [row] [col]);
                }
                System.out.println(" ");
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
