package namta;

import java.util.Scanner;

public class Namta {

    public static void main(String[] args) {

        System.out.println("Pls enter number");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result = userInput * i;
            System.out.println(userInput + "x" + i + " =" + result);
        }

    }

}
