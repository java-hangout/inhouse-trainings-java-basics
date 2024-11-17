package com.jh.iht.java.basics.controlflow;

public class LForEachLoop {
    // Method to sum elements in an array using for-each loop
    public int sumUsingForEachLoop(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}