package edu.patytux.duckdinasty;

import edu.patytux.duckdinasty.duck.RubberDuck;
import edu.patytux.duckdinasty.duck.RedheadDuck;
import edu.patytux.duckdinasty.duck.ModelDuck;
import edu.patytux.duckdinasty.duck.MallardDuck;
import edu.patytux.duckdinasty.duck.DecoyDuck;
import edu.patytux.duckdinasty.duck.Duck;
import edu.patytux.duckdinasty.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performQuack();
        redhead.performFly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
