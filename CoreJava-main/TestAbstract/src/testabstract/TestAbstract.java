
package testabstract;

import geo.Circle;
import geo.GeomatryObject;
import geo.Recangle;


public class TestAbstract {

   
    public static void main(String[] args) {
        
        GeomatryObject circle=new Circle(5);        
        GeomatryObject rec=new Recangle(10, 6);
        
        System.out.println("Circle Area is "+ circle.getArea()+
                " perimeter is "+circle.getPerimeter());
        
        System.out.println("Recangle Area is "+ rec.getArea()+
                " perimeter is "+rec.getPerimeter());
        
    }
    
}
