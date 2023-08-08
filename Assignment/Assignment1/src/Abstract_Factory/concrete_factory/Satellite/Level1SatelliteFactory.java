package Abstract_Factory.concrete_factory.Satellite;

import Abstract_Factory.Obstacle;
import Abstract_Factory.porduct.Satelite.*;

public class Level1SatelliteFactory extends SatelliteFactory {


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new WeatherSatellite();
        else return new NavigationSatellite();
    }
}
