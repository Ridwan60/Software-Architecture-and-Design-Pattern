package Abstract_Factory.concrete_factory.Nebula;

import Abstract_Factory.Obstacle;
import Abstract_Factory.porduct.Nebula.DarkNebula;
import Abstract_Factory.porduct.Nebula.EmissionNebula;
import Abstract_Factory.porduct.Nebula.ReflectionNebula;

public class Level1NebulaFactory extends NebulaFactory {


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new DarkNebula();
        else return new EmissionNebula();
    }
}
