package javaapplication17;

public class JavaApplication17 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) { //  j=1 i=6
            System.out.print(num + " "); // num= 2 , 4, 8, 16, 32, 64
            num *= 2;                   // num = 4 , 8, 16, 32, 64, 128
        }
        System.out.println();
    }
    
    
}
