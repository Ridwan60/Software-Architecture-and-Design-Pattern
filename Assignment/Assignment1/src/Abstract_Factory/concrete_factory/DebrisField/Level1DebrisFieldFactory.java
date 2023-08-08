package Abstract_Factory.concrete_factory.DebrisField;

import Abstract_Factory.porduct.DebrisField.DynamicDebrisField;
import Abstract_Factory.porduct.DebrisField.StaticDebrisField;
import Abstract_Factory.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}
