package Abstract_Factory.concrete_factory.Comet;

import Abstract_Factory.porduct.Comet.LongTailed;
import Abstract_Factory.Obstacle;
import Abstract_Factory.porduct.Comet.ShortTailed;

public class Level1CometFactory extends CometFactory {


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new LongTailed();
        else return new ShortTailed();
    }
}
