package arraytest;



public class ArrayTest {

    public static void main(String[] args) {

        String[] studentNames = new String[10];
        studentNames[0] = "Rajib";
        studentNames[1] = "Limon";
       

        int[] marks = new int[11];
        marks[0] = 20;
        marks[1] = 50;
        marks[2] = 30;
        marks[5] = 10;


        for(int i=0; i<marks.length; i++){
            System.out.println("Student name is "+studentNames[i]+" and mark is "+marks[i]);
        }

    }

}
