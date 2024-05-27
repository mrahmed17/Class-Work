package transportmanagement;

import transport.Car;
import transport.Motorcycle;
import transport.Vehicle;

public class TransportManagement {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.stop();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();

        //Polymophism
        Vehicle carVehicle = new Car();
        carVehicle.start();
        carVehicle.stop();

        Vehicle motVehicle = new Motorcycle();
        motVehicle.start();
        motVehicle.stop();

    }

}
