
package bubblesortarray;

import java.util.Arrays;
public class BubbleSortArray {

   
    public static void main(String[] args) {
       int[][] myArray = {{11, 55, 32}, {41, 69, 32, 75}, {85, 9}, {92, 30, 57, 35, 52}, {65, 20, 59, 3, 988, 88, 3}};

       
        for (int row = 0; row < myArray.length; row++) {
            for (int k = 0; k < myArray[row].length - 1; k++) {
                for (int col = 0; col < myArray[row].length - 1; col++) {

                    if (myArray[row][col] > myArray[row][col + 1]) {
                        int temp = myArray[row][col];
                        myArray[row][col] = myArray[row][col + 1];
                        myArray[row][col + 1] = temp;

                    }
                }
            }

        }
        System.out.println("Ascending result is = " + Arrays.deepToString(myArray));
        
        
        
    }
    
}
