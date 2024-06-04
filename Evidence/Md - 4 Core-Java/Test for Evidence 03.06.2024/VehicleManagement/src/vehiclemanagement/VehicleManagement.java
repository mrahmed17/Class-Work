
package vehiclemanagement;

public class VehicleManagement {

    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car myCar = new Car("ABC123", "Toyota", 2022);
        Motorcycle myMotorcycle = new Motorcycle("XYZ456", "Honda", 2021);

        // Start and stop engines
        myCar.start();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.stop();
        
    }
    
}
