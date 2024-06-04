package vehiclemanagement;

import Vehicle.Truck;
public class VehicleManagement {

    public static void main(String[] args) {

        Truck heavyTruck = new Truck(80, 35000.0, "Blue", 2800);
        System.out.println("Sale price of heavy truck: $" + heavyTruck.getSalePrice());

        Truck lightTruck = new Truck(60, 20000.0, "Red", 1800);
        System.out.println("Sale price of light truck: $" + lightTruck.getSalePrice());

    }

}
