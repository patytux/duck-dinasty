package edu.patytux.duckdinasty.duck;

import edu.patytux.duckdinasty.fly.FlyNoWay;
import edu.patytux.duckdinasty.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
