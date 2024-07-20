package DesignPattern.Builder.Car;

public class Director {
    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constructCar(){
        builder.buildEngine();
        builder.buildBody();
        builder.buildGear();
        builder.buildSeats();
    }
    public Car getCar(){
        return builder.getCar();
    }
}
