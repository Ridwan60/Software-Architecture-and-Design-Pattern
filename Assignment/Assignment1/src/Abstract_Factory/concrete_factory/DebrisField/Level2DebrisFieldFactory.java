package Abstract_Factory.concrete_factory.DebrisField;

import Abstract_Factory.porduct.DebrisField.PersistentDebrisField;
import Abstract_Factory.porduct.DebrisField.StaticDebrisField;
import Abstract_Factory.Obstacle;

public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new PersistentDebrisField();
        else return new StaticDebrisField();
    }
}
