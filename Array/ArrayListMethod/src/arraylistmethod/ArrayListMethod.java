package arraylistmethod;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        //Adding number
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.println("ArrayList=" + number);
        System.out.println("Empty =" + number.isEmpty());     //empty method 
        System.out.println("is it contains =" + number.contains(20));         //contains method

        System.out.println("After replacing ArrayList=" + number.set(0, 99));     //set method
        System.out.println("ArrayList=" + number);
        System.out.println("Get 1 =" + number.get(1));        //get method
        System.out.println("" + number.indexOf(99));          //index of method

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(11);
        number1.add(22);
        number1.add(33);
        number1.add(44);

        number2.add(110);
        number2.add(220);
        number2.add(330);
        number2.add(440);

        number3.addAll(number1);        //addAll method

        System.out.println("Number1=" + number1);
        System.out.println("Number2=" + number2);
        System.out.println("Number3=" + number3);

        System.out.println("number1 & number3 are equals?=" + number3.equals(number1));       // equals method

    }

}
