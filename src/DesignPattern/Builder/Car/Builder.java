package DesignPattern.Builder.Car;

public interface Builder {
    void buildEngine();
    void buildBody();
    void buildGear();
    void buildSeats();

//    Car getCar();
}
