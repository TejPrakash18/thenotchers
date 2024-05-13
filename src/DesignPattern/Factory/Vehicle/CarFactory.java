package DesignPattern.Factory.Vehicle;

public class CarFactory implements VehicalFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
