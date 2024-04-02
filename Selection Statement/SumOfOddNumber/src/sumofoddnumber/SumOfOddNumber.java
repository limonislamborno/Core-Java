
package sumofoddnumber;

import java.util.Scanner;


public class SumOfOddNumber {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter starting point");
        int startingPoint=sc.nextInt();
        
        System.out.println("Pls enter ending point");
        int endingPoint=sc.nextInt();
        int sum=0;
        
        for(int i=startingPoint; i<=endingPoint; i++){
            if(i%2!=0){
            sum+=i;
            }

        }
        System.out.println("Sum is "+sum);
    }
    
}
