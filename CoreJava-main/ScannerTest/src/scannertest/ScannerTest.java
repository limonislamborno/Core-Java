
package scannertest;

import java.util.Scanner;


public class ScannerTest {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        
        // Calculate user input values as sum
        System.out.println("Pls enter elements number ");
        int n=sc.nextInt();
        
        int sum=0;        
        
        for (int i=1; i<=n; i++){
            int number=sc.nextInt();            
            sum +=number;
        }
        
        System.out.println(sum);
        
        
      
//        String grettings; 
//        
//        System.out.println("Pls enter grettings: ");
//        
//        grettings=sc.nextLine();
//        
//        System.out.println(grettings+" Java");

//           int n1, n2;
//           System.out.println("Pls enter number 1 ");           
//           n1=sc.nextInt();
//           
//           System.out.println("Pls enter number 2 ");
//           n2=sc.nextInt();
//           
//           int result=n1+n2;
//           
//           System.out.println("The total of two number is "+result);
        
//            int number, sum=0;
//            for(int i=1; i<=10; i++){
//                System.out.println("Pls enter number "+i);
//                number=sc.nextInt();
//                sum +=number; // sum=sum+number
//            }
//           
//            System.out.println("Total is "+ sum);
//    final float PI=3.1416f;
//    float radius=sc.nextFloat();
//    float redult=radius*radius*PI;
//    
//        System.out.println(redult);
//
//        System.out.println(System.currentTimeMillis());


    }
    
}
