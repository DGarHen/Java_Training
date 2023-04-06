package com.trainning.java;

import java.util.Arrays;

public class BasicsTypes {
    public static void main(String[] args) {
        comparePrimitiveVSReferenceType();
    }

    public static void comparePrimitiveVSReferenceType(){
        int i = 5;
        int[] I = {5};
        changePrimitive(i);
        changeReference(I);
        System.out.println("primitive:"+i);
        System.out.println("reference:"+ Arrays.toString(I));
    }
    private static void changePrimitive(int a){
        a++;
    }
    private static void changeReference(int[] a){
        a[0]++;
    }
}
