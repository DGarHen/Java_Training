package com.training.java.basic.inheritance;

public abstract class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    public void makeSound(){
        System.out.println("Sound of the wild");
    }
    public void move(){
        System.out.println("Walking");
    }

    public String getName(){return this.name;}

}
