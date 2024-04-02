package array;

import java.util.Arrays;

public class MyArray {

    public void finMaxMin(int[] numbers) {

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {

            max = number > max ? number : max;
            min = number < min ? number : min;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Max no is= " + max + " Min no is= " + min);

    }

    public int doSum(int... a) {
        int sum = 0;

//        for (int val : a){
//            sum +=val;
//        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public int doSumm(int a, int b) {

        return a + b;
    }
    
    
    public void findElementInArray(int a, int[] myArray){
        int val=0;
        for(int i=0; i<myArray.length; i++){
            val=myArray[i];
            if(val==a){
                System.out.println("Value Found");
                break;
            }            
        }
        
        if(val!= a){
            System.out.println("Value not Found");
        }
    
        
        
    }

}
