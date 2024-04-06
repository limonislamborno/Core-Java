
package matrixarraytest;

import java.util.Scanner;


public class MatrixArrayTest {

   
    public static void main(String[] args) { 
        Scanner input=new Scanner (System.in);
        int [][] A=new int[3][3];
        int [][] B=new int[3][3];
       //inserting number in A matrix
        for(int row=0; row<3;row++){
            for(int col=0; col<3; col++){
                System.out.printf("A [%d],[%d]=",row,col);
                A [row][col]=input.nextInt();
            }
            System.out.println();
        
        }
//        //inserting number in B matrix
//        for(int row=0; row<3;row++){
//            for(int col=0; col<3; col++){
//                System.out.printf("B [%d],[%d]=",row,col);
//                B [row][col]=input.nextInt();
//            }
//            System.out.println();
//        
//        }
        
        //printing A matrix
        System.out.println("A=");
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print("\t"+A [row][col]);
            }
            System.out.println();

        }
//        //printing B matrix
//          System.out.println("B= ");
//        for(int row=0; row<3; row++){
//            for(int col=0; col<3; col++){
//                System.out.print("\t"+B [row][col]);
//            }
//            System.out.println();
//
//        }
        
        //diagnal sum
        int sumOfDiagnal=0;
         
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                if(row==col){
                    sumOfDiagnal+=A[row][col];
                }
            }
            System.out.println();

        }
         //Lower sum
        int sumOfLower=0;
          
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                if(row>col){
                    sumOfLower+=A[row][col];
                }
            }
            System.out.println();

        }
        //Upper sum
        int sumOfUpper=0;
           
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                if(row<col){
                    sumOfUpper+=A[row][col];
                }
            }
            System.out.println();

        }
        System.out.println("Diagnal sum"+sumOfDiagnal);
        System.out.println("Upper sum"+sumOfUpper);
        System.out.println("Lower sum"+sumOfLower);
        
        
    }
    
}
