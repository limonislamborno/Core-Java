
package maxminavgsum;
import java.util.Arrays;
import java.util.Scanner;


public class MaxMinAvgSum {

   
    public static void main(String[] args) {
        
        System.out.println("Enter araay size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double[] numbers = new double[size];
        double sum = 0;
        double avg = 0;
        double max = 0;
        double min = 9999999;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            sum += numbers[i];

//            if(numbers[i]>max){
//            max=numbers[i];
//            }
//             if(numbers[i]<min){
//            min=numbers[i];
//            }
            max = numbers[i] > max ? numbers[i] : max;
            min = numbers[i] < min ? numbers[i] : min;

        }
        avg = sum / numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of array is " + (int) sum + " Average is " + avg + " Maximum number is " + (int)max + " Minimum nuber is " +(int) min);
    }
    
}
