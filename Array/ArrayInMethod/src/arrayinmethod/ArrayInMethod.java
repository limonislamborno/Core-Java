package arrayinmethod;

import array.MyArray;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInMethod {
    
    public static void main(String[] args) {
        MyArray array = new MyArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = in.nextInt();
        
        int[] numbers = new int[size];        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);            
        }
        
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        
//        array.finMaxMin(numbers);
        System.out.println(Arrays.toString(numbers));
//        array.findElementInArray(91, numbers);
        
//        System.out.println(array.doSum(10, 20, 30, 40, 50));
//        System.out.println(array.doSumm(10, 10));
        
    }
    
}
