package com.trainning.java.basic.polymorphism;

import com.trainning.java.basic.inheritance.Animal;
import com.trainning.java.basic.inheritance.Cat;
import com.trainning.java.basic.inheritance.Dog;

public class PolymorphismTest {
    public static void main(String[] args) {
        polymorphismCompileTime();
        pets();
    }
    private static void polymorphismCompileTime(){
        com.trainning.java.basic.polymorphism.PolyOverloading figure = new com.trainning.java.basic.polymorphism.PolyOverloading();
        System.out.println("Using int calculate the area of a square: "+figure.calculateArea(5));
        System.out.println("Using 2 params calculate the area of a rectangle: "+figure.calculateArea(5,4));
        System.out.println("Using double calculate the area of a circle: "+figure.calculateArea(9.0));
        System.out.println("Using float calculate the area of a square: "+figure.calculateArea(9.0f));
    }
    private static void pets(){
        Dog tasha = new Dog();
        Cat michi = new Cat();
        takeAWalk(tasha);
        takeAWalk(michi);
    }
    private static void takeAWalk(Animal pet){
        System.out.println("Let's take a walk?");
        pet.makeSound();
        pet.move();
    }

}
