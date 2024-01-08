package Oops.Inheritence.Excercise2;

public class Bike extends Vehical{
    private double engineDisplacement;

    public Bike(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
        //  this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }
}
