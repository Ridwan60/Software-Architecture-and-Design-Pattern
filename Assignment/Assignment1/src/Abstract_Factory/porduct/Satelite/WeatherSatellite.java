package Abstract_Factory.porduct.Satelite;


public class WeatherSatellite implements Satellite {

    @Override
    public void show() {
        System.out.println("Weather Satellite has arrived");
    }
}
