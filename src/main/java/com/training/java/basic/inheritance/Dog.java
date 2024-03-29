package com.training.java.basic.inheritance;

public class Dog extends Animal implements Training{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Barking");
    }
    @Override
    public void giveHand() {
        System.out.println("-"+getName()+" gives its hand");
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
