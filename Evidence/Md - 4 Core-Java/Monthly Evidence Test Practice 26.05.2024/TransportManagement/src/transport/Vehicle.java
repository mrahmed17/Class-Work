
package transport;

public abstract class Vehicle {
    
    private String registrationNumber;
    private String brand;
    private int year;

 
    public abstract void start();
    
    public abstract void stop();

    public String getRegistrationNum() {
        return registrationNumber;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNumber = registrationNum;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
