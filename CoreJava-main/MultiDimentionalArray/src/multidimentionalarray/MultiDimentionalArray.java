
package multidimentionalarray;

import java.util.Arrays;


public class MultiDimentionalArray {

   
    public static void main(String[] args) {
       int[][] matrix=new int[3][4];
       
//       matrix[0][0]=5;
//       matrix[0][1]=8;
//       matrix[0][2]=9;
//       
//       matrix[1][0]=1;
//       matrix[1][1]=5;
//       matrix[1][2]=5;
       
       System.out.println(Arrays.deepToString(matrix)); 
      
       for(int row=0; row<3; row++){ // for Row
           for(int column=0; column<4; column++){ // for Column
           
               System.out.print(matrix[row][column]+" ");
           }
           System.out.println("");
       }
        
        
        
    }
    
}
