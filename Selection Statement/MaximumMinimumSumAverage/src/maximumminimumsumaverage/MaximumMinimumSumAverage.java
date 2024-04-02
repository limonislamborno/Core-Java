
package maximumminimumsumaverage;

import java.util.Scanner;


public class MaximumMinimumSumAverage {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pls enter amount of numbers");
        int n =sc.nextInt();
        
        int max=0;
        int min=99999999;
        int sum=0;
        
        for(int i=1; i<=n; i++){
            System.out.println("Pls enter number"+i);
            int number=sc.nextInt();
            
            sum+=number;
            if(number>max){
            max=number;
            }
           
            if(number<min){
            min=number;
            }
           
        
        
        
        }
        
        System.out.println("Maximum number is "+max+"Minimum number is"+min);
        
        
    }
    
}
