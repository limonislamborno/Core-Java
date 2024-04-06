package arraylistsort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(2);
        number.add(3);
        number.add(7);

        //ascending
        Collections.sort(number);
        System.out.println("Ascending arrayList" + number);

        //descending
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Ascending arrayList" + number);

    }

}
