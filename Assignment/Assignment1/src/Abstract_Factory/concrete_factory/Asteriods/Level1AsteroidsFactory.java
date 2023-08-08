package Abstract_Factory.concrete_factory.Asteriods;

import Abstract_Factory.porduct.Asteriods.Asteriods;
import Abstract_Factory.porduct.Asteriods.Ice_Asteroids;
import Abstract_Factory.porduct.Asteriods.Iron_Asteroids;
import Abstract_Factory.Obstacle;


public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteriods) new Iron_Asteroids();
    }
}
