package mathclass;

public class MathClass {

    public static void main(String[] args) {
        int x = 10;
        int y = 99;
        int z = -50;

        int max = Math.max(x, y);
        System.out.println("Maximum Number is " + max);

        int min = Math.min(x, y);
        System.out.println("Maximum Number is " + min);

        double pi = Math.PI;
        System.out.println("Pi result is " + pi);

        float floatNumber = 3.666f;
        int roundNumber = Math.round(floatNumber);
        System.out.println("Round number of " + floatNumber + " is " + roundNumber);

        int absoulateNumber = Math.abs(z);
        System.out.println("Absoulate number is " + absoulateNumber);

    }

}
