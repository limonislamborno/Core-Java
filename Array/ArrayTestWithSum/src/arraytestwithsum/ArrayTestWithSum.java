
package arraytestwithsum;

import java.util.Scanner;


public class ArrayTestWithSum {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sum=0;
        double max=0;
        double min=9999999;
        
        System.out.println("Pls enter array size");
        int arraySize=input.nextInt();
        
        double [] myArray=new double[arraySize];
        
        System.out.println("Pls enter number");
        
        for(int i=0; i<myArray.length; i++){
            myArray[i]=input.nextDouble();
        sum+=myArray[i];
        
        if(myArray[i]>max){
        max=myArray[i];
        }
        if(myArray[i]<min){
        min=myArray[i];
        }
        
        
        
        }
        
        System.out.println("Sum is "+sum);
        double avg;
        avg=sum/myArray.length;
        System.out.println("Average is "+avg+"Maximum ="+max+"Minimum= "+min);
        System.out.printf("maximum is =%.0f",max);
        
    }
    
}
