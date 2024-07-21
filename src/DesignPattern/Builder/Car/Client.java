package DesignPattern.Builder.Car;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();

        Director director = new Director(concreteBuilder);

        director.constructCar();

//        Car car = director.getCar();
        Car car = concreteBuilder.getCar();
        concreteBuilder.color();
        System.out.println(car);
    }
}
