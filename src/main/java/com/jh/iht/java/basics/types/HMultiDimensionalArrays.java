package com.jh.iht.java.basics.types;

public class HMultiDimensionalArrays {
    // Method to sum all elements in a 2D array
    public int sum2DArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}