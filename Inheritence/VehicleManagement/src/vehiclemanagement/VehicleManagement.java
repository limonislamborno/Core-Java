
package vehiclemanagement;

import trav.Car;
import trav.MotorCycle;
import trav.Vehicle;


public class VehicleManagement {

   
    public static void main(String[] args) {
        Vehicle car=new Car("A-2020", "BMW", 2020);
        Vehicle motorCycle=new MotorCycle("LA-40-7274", "MT-15", 2021);
        
        car.start();
        car.stop();
        car.details();
        
        motorCycle.start();
        motorCycle.stop();
        motorCycle.details();
    }
    
}
