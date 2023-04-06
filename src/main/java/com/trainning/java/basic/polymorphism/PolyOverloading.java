package com.trainning.java.basic.polymorphism;

public class PolyOverloading {
    public int calculateArea(int l){
        return l*l;
    }
    public float calculateArea(float l){
        return l*l;
    }
    public int calculateArea(int lenth, int width){
        return lenth*width;
    }
    public double calculateArea(double r){
        return Double.parseDouble(String.format("%.2f", Math.PI*(r*r)));
    }
}
