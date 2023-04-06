package com.trainning.java.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        PolyOverloading figure = new PolyOverloading();
        System.out.println("Using int calculate the area of a square: "+figure.calculateArea(5));
        System.out.println("Using 2 params calculate the area of a rectangle: "+figure.calculateArea(5,4));
        System.out.println("Using double calculate the area of a circle: "+figure.calculateArea(9.0));
        System.out.println("Using float calculate the area of a square: "+figure.calculateArea(9.0f));

    }
}
