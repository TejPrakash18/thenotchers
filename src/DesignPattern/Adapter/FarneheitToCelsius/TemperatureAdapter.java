package DesignPattern.Adapter.FarneheitToCelsius;

public class TemperatureAdapter implements CelsiusTemperature{
    private FahrenheitTemperature fahrenheitTemperature;

    public TemperatureAdapter(FahrenheitTemperature fahrenheitTemperature){
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getTemperatureCelsius()
    {
        double tempf = fahrenheitTemperature.getTemperatureFahrenheit();
        return  (tempf - 32) *5/9;

    }
}
