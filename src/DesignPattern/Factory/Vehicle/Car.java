package DesignPattern.Factory.Vehicle;

public class Car implements Vehicle{
    @Override
    public void manufacture() {
        System.out.println("Create a car");
    }
}
