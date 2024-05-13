package DesignPattern.Factory.Vehicle;

public class Main {
    public static void main(String[] args) {

        VehicalFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture();

        VehicalFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.manufacture();
    }
}
