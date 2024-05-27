package DesignPattern.Adapter.FarneheitToCelsius;

public class Client {
    public static void main(String[] args) {
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature();
        CelsiusTemperature adapter = new TemperatureAdapter(fahrenheitTemperature);

        System.out.println("Temperature in Celsius: " + adapter.getTemperatureCelsius());
    }
}
