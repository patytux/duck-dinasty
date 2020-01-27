package edu.patytux.duckdinasty;

public abstract class Duck {

    public void quack() {
        System.out.println("quack quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    abstract void display();

}
