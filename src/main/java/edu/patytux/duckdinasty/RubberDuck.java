package edu.patytux.duckdinasty;

public class RubberDuck extends Duck implements Quackable {

    @Override
    void display() {
        System.out.println("Looks like a rubber");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

}
