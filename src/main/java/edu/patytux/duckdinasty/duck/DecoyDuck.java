package edu.patytux.duckdinasty.duck;

import edu.patytux.duckdinasty.fly.FlyNoWay;
import edu.patytux.duckdinasty.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }

}
