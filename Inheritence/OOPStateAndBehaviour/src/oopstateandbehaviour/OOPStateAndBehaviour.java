
package oopstateandbehaviour;

import geo.Circle;
import geo.Student;
import java.util.Scanner;


public class OOPStateAndBehaviour {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Pls enter radius ");
        
//        double radius=s.nextDouble();
        Circle c=new Circle();
        Student student=new Student("Rajib", "654645646");
        Student student1=new Student();
        student1.setName("Tonmoy");
//        student1.setEmail("dfsdsfsdf");
        student1.setCell("548455445");
        
        
        
        
        Student student2=new Student(1, "Foysal", "SADsad","565546" );
        
//        c.setRadius(radius);
        
//        System.out.println("Area: "+c.getArea());
//        System.out.println("Perimeter: "+c.getPerimeter());
        
        student.printStuInfo();
        student1.printStuInfo();
        student2.printStuInfo();
        
    }
    
}
