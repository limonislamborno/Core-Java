
package evidencecorejava;

import pak.Truck;
import pak.Vehicle;


public class EvidenceCoreJava {

  
    public static void main(String[] args) {
        Vehicle vehicle=new Truck();
        Truck truck=new Truck();
        
        
        truck.setRegularPrice(1000);
        truck.setWeight(2005);
        
        System.out.println(truck.getSalePrice());
        
        
    }
    
}
