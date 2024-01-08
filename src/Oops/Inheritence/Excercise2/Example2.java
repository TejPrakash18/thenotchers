package Oops.Inheritence.Excercise2;

public class Example2 {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Bike bike = new Bike("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

        System.out.println("Car make = " + car.getMake());
        System.out.println("Car model = " + car.getModel());
        System.out.println("Car year = " + car.getYear());
        System.out.println("Car fuelType = "+ car.getFuelType());
        System.out.println("Car fuelEfficiency = " + car.getFuelEfficiency() );
        System.out.println("Car seat = " + car.getNumSeats());
        System.out.println();
        System.out.println("Bike make = " + bike.getMake());
        System.out.println("Bike model  = " + bike.getModel());
        System.out.println("Bike year = " + bike.getYear());
        System.out.println("Bike fuelType = "+ bike.getFuelType());
        System.out.println("Bike fuelEfficiency = " + bike.getFuelEfficiency() );
    }
}
