
package vehiclemanagement;

// Concrete class Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }
}