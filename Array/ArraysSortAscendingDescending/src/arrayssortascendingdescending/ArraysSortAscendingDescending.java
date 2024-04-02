package arrayssortascendingdescending;

import java.util.Arrays;

public class ArraysSortAscendingDescending {

    public static void main(String[] args) {
        int[] number = {100, 20, 90, 99, 50};
        //Ascending number
        Arrays.sort(number);
        System.out.println("Ascending: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" \t" + number[i]);
        }
        //Descending number
        System.out.println(" ");
        System.out.println("Descending: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" \t" + number[i]);
        }
        
        //Ascending names
        System.out.println(" ");
        String[] names = {"Limon islam", "Sampati", "Shondhi", "Arshi"};
        Arrays.sort(names);
        System.out.println("Ascending: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" \t" + names[i]);
        }

        //Descending names
        System.out.println(" ");
        System.out.println("Descending: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(" \t" + names[i]);
        }

    }

}
