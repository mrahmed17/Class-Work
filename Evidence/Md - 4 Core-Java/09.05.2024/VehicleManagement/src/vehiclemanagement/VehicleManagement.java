
package vehiclemanagement;

import vehicle.Truck;


public class VehicleManagement {

    public static void main(String[] args) {
        
//        Truck truck =new Truck(2000, 85, 180, "Yellow");
        
        Truck truck =new Truck();
        
        truck.setRegularPrice(2000);
        truck.setWeight(2004);
        
        System.out.println(truck.getSalePrice());
        
    }
    
}
