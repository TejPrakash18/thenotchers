package DesignPattern.Builder.Car;

public class ConcreteBuilder implements Builder {
    public Car car;

    public ConcreteBuilder(){
        this.car = new Car();
    }
    @Override
    public void buildEngine() {
        car.setEngine("V8 Engine");
    }

    @Override
    public void buildBody() {
        car.setBody("Sedan");

    }

    @Override
    public void buildGear() {
        car.setGear(4);
    }

    @Override
    public void buildSeats() {
        car.setSeats(8);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
