
package logicaloperator;

import java.util.Scanner;


public class LogicalOperator {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Do u complete masters?");
        char ans1=sc.next().charAt(0);
        char ans11=Character.toLowerCase(ans1);
        
        
        System.out.println("Do u know english?");
        char ans2=sc.next().charAt(0);
        char ans22=Character.toLowerCase(ans2);
        
        if(ans11=='y' && ans22=='y'){
            System.out.println("you are eligible for this job");
        }
        else if(ans11=='n' || ans22=='y' && ans22=='n' || ans11=='y'){
            System.out.println("Sorry");
        }
        else{
            System.out.println("your statement is false");
        }
  
        
    }  
}
