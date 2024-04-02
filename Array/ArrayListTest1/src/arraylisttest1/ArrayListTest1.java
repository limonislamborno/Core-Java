
package arraylisttest1;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest1 {

   
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        //Adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        
        System.out.println("Size is="+number.size());
        System.out.println("Printing using iterator");
        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.println(" "+itr.next());

        }
        System.out.println("Printing using for each loop");
        for(int x:number){
            System.out.println(" "+x);
        }
        
        //removing elements
        number.remove(0);
        System.out.println(number);
        number.removeAll(number);
         System.out.println(number);
        
    }
    
}
