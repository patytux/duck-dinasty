package edu.patytux.duckdinasty.duck;

import edu.patytux.duckdinasty.fly.FlyWithWings;
import edu.patytux.duckdinasty.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
