package edu.patytux.duckdinasty;

public abstract class Duck {

    public void quack() {
        System.out.println("quack quack");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void fly() {
        System.out.println("Flying");
    }

    abstract void display();

}
