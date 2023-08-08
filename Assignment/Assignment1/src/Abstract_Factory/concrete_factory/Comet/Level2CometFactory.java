package Abstract_Factory.concrete_factory.Comet;

import Abstract_Factory.porduct.Comet.LongTailed;
import Abstract_Factory.porduct.Comet.ShortTailed;

import Abstract_Factory.Obstacle;

public class Level2CometFactory extends CometFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new ShortTailed();
        else return new LongTailed();
    }
}
