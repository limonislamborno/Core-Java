package stringtest;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter item number ");
        int n = input.nextInt();

        int max = 0, min = 999999999;
        int inputNumbr, sum=0;
        int avgNumber=n;
        
        while (n > 0) {
            System.out.println("enter number ");
            inputNumbr = input.nextInt();
            sum +=inputNumbr;
            if (max < inputNumbr) {
                max = inputNumbr;
            }

            if (min  > inputNumbr) { // min = 99999999 , inputNumber =99999999
                min = inputNumbr;
            }
            n--;
        }
        
        avgNumber=sum/avgNumber;
        System.out.println("Max number = "+max); 
        System.out.println("Min number = "+min);
        System.out.println("avg number = "+(double)avgNumber);
        
    }
}
