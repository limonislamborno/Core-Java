
package arraycheck;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayCheck {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter araay size");
        int size=sc.nextInt();
        int max=0;
        int min=9999999;

        String [] studentName=new String [size];
        studentName[0]="Limon";
        studentName[1]="Saifullah";
        studentName[2]="Khan Rakib";
        studentName[3]="Sabbir Haasan";
        studentName[4]="Shojol";
 
        int [] marks=new int[5];
        
        for(int i=0; i<marks.length; i++){
            marks[i]=(int)(Math.random()*100);
            
//            if(marks[i]>max){
//            max=marks[i];
//            }
//            
//            if(marks[i]<min){
//                min=marks[i];
//            }
            max= marks[i] > max ? marks[i] : max ;
            min= marks[i] < min ? marks[i] : min;  
        }
       
        for(int i=0; i<studentName.length; i++){
            System.out.println("Student Name is "+studentName[i]+" And marks is "+marks[i]); 
        
        }
         System.out.println(" ");
         System.out.println("Max number is "+max+" Min Number is "+min);

         
    }
    
}
