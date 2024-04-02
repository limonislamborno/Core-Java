package ifelsetest;

import java.util.Scanner;

public class IfElseTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pls enter your mark ");
        int mark = in.nextInt();

        int i = 1, j = 2, k = 3;
        if (i > j) {
            if (i > k) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
//        if (mark < 0 || mark > 100) {
//            System.out.println("Invalied ");
//        } else if (mark <= 50) {
//            System.out.println("B+");
//        } else if (mark <= 80) {
//            System.out.println("A+");
//        }

    }

}
