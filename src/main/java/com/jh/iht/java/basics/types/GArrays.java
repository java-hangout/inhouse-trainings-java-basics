package com.jh.iht.java.basics.types;

public class GArrays {
    // Method to double the values in an array
    public int[] doubleArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }
}