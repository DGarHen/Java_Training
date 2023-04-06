package com.training.java.basic.inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meowing");
    }
}
