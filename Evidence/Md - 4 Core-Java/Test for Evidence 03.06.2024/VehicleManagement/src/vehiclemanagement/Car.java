
package vehiclemanagement;

// Concrete class Car
class Car extends Vehicle {
    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}
