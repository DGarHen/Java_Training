package com.training.java.basic.inheritance;

public class Pig extends Animal implements Training{
    public Pig(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Grunting");
    }
    @Override
    public void giveHand() {
        System.out.println("-"+getName()+" can't give its hand");
    }
    @Override
    public void sit() {
        System.out.println("-"+getName()+" sit down");
    }
    @Override
    public void stay() {
        System.out.println("-"+getName()+" stands still");
    }
}
