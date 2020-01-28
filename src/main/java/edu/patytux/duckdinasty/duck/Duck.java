package edu.patytux.duckdinasty.duck;

import edu.patytux.duckdinasty.fly.FlyBehavior;
import edu.patytux.duckdinasty.quack.QuackBehavior;

public abstract class Duck {

    protected QuackBehavior quackBehavior;

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Swimming");
    }

}
