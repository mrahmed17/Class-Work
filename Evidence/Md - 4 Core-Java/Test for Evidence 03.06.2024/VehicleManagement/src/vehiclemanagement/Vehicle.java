
package vehiclemanagement;

// Abstract class Vehicle
public abstract class Vehicle {
    private String registrationNumber;
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String registrationNumber, String brand, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
    }


    public abstract void start();
    public abstract void stop();


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
