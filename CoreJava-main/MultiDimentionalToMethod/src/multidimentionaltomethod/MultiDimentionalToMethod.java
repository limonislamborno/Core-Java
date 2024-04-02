package multidimentionaltomethod;

import array.TwoDArrayInMethod;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalToMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row nuomber ");
        int row = s.nextInt();

        System.out.println("Enter Column nuomber ");
        int col = s.nextInt();

        TwoDArrayInMethod robiul = new TwoDArrayInMethod();

        int[][] newArray = robiul.createArray(row, col);

        int sumOfArray = robiul.doSum(newArray);
        System.out.println(sumOfArray);

//        int[][] numbers={{1,2,3,4},{5,6,7,8}};
//        int[][] marks=new int[5][3];        
//        System.out.println(Arrays.deepToString(marks));
//        
//        System.out.println("Number is: "+robiul.doSum(numbers));
//        System.out.println("Marks is: "+robiul.doSum(marks));
    }

}
