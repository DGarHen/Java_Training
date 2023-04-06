package com.training.java.basic.polymorphism;

import com.training.java.basic.inheritance.*;

public class PolymorphismTest {
    public static void main(String[] args) {
        polymorphismCompileTime();
        pets();
        trainingPets();
    }
    private static void trainingPets() {
        Dog tasha = new Dog("Tasha");
        Cat michi = new Cat("Michi");
        Pig brave = new Pig("Brave");
        doSomeTricks(tasha);
        doSomeTricks(brave);
    }
    private static void polymorphismCompileTime(){
        PolyOverloading figure = new PolyOverloading();
        System.out.println("Using int calculate the area of a square: "+figure.calculateArea(5));
        System.out.println("Using 2 params calculate the area of a rectangle: "+figure.calculateArea(5,4));
        System.out.println("Using double calculate the area of a circle: "+figure.calculateArea(9.0));
        System.out.println("Using float calculate the area of a square: "+figure.calculateArea(9.0f));
    }
    private static void pets(){
        Dog tasha = new Dog("Tasha");
        Cat michi = new Cat("Michi");
        takeAWalk(tasha);
        takeAWalk(michi);
    }
    private static void takeAWalk(Animal pet){
        System.out.println("Let's go, "+pet.getName()+", take a walk?");
        pet.makeSound();
        pet.move();
    }
    private static void doSomeTricks(Training trained_pet){
        trained_pet.sit();
        trained_pet.stay();
        trained_pet.giveHand();
    }

}
