package DesignPattern.Factory.Vehicle;

public class Bike implements Vehicle{
    @Override
    public void manufacture() {
        System.out.println("create a Bike");
    }
}
