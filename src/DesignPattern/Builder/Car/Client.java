package DesignPattern.Builder.Car;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        director.constructCar();

        Car car = director.getCar();
        System.out.println(car);
    }
}
