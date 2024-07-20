package DesignPattern.Builder.Car;

public class Car {
    private String engine;
    private String body;
    private int gear;
    private int seats;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setGear(int gear) {
        this.gear= gear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "car [Engine "+ engine +", Body "+ body + " Seats " + seats+ " Wheels "+ gear + " ]";
    }
}
