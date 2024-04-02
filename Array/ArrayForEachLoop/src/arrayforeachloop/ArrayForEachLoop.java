package arrayforeachloop;

public class ArrayForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Limon", "Samapti Nandi", "Khan Rakib"};

        for (String x : names) {
            System.out.println(x);
        }
        
        
        int sum = 0;
        int[] number = {10, 20, 30};
        for (int x : number) {
            System.out.println(x);
            sum += x;
        }
        System.out.println("Sum is " + sum);

    }

}
