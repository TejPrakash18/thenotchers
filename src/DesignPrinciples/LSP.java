package DesignPrinciples;


interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed+=10;
    }
}
class Bicycle implements Bike{
    int speed;
    @Override
    public void accelerate() {
        speed+=5;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }
}



//Liskov substitution principle
public class LSP {
    public static void main(String[] args) {
        System.out.println("Liskov substitution principle");
    }
}
