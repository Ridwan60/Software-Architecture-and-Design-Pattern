package Abstract_Factory;

import Abstract_Factory.abstract_factory.ObstacleFactory;
import Abstract_Factory.concrete_factory.Asteriods.*;
import Abstract_Factory.concrete_factory.Comet.*;
import Abstract_Factory.concrete_factory.Nebula.*;
import Abstract_Factory.concrete_factory.Satellite.*;
import Abstract_Factory.concrete_factory.DebrisField.*;


public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory factory;

        if(level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        //newwwwww
        if(level == 1) factory = new Level1CometFactory();
        else factory = new Level2CometFactory();

        score = (int)(Math.random() * 2000);

        obstacle = factory.createObstacle(score);
        obstacle.show();


        if(level == 1) factory = new Level1NebulaFactory();
        else factory = new Level2NebulaFactory();

        score = (int)(Math.random() * 2000);

        obstacle = factory.createObstacle(score);
        obstacle.show();


        if(level == 1) factory = new Level1SatelliteFactory();
        else factory = new Level2SatelliteFactory();

        score = (int)(Math.random() * 2000);

        obstacle = factory.createObstacle(score);
        obstacle.show();

    }
}
