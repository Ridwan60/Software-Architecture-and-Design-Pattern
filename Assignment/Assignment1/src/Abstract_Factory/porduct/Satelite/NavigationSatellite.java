package Abstract_Factory.porduct.Satelite;


public class NavigationSatellite implements Satellite {

    @Override
    public void show() {
        System.out.println("Navigation Satellite has arrived");
    }
}
