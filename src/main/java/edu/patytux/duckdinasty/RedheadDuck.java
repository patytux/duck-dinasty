package edu.patytux.duckdinasty;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("Looks like a redhead");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

}
