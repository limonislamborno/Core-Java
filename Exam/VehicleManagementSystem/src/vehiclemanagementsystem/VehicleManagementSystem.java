
package vehiclemanagementsystem;

import pack.Car;
import pack.MotorCycle;
import pack.Vehicle;


public class VehicleManagementSystem {

   
    public static void main(String[] args) {
        Vehicle car=new Car("La-141599,", "Yamaha,", 2021);
        Vehicle motorCycle=new MotorCycle("La-111219,", "BMW,", 2023);
        
        
        car.printDetails();
        car.start();
        car.stop();
      
        motorCycle.printDetails();
        motorCycle.start();
        motorCycle.stop();
        
    }
    
}
