package DesignPattern.Factory.Vehicle;

public class BikeFactory implements VehicalFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
