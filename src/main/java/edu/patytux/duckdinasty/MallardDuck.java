package edu.patytux.duckdinasty;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("Looks like a Mallard");
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
