package DesignPattern.Builder.Car;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        director.constructCar();

        Car car = director.getCar();
        builder.color();
        System.out.println(car);
    }
}
