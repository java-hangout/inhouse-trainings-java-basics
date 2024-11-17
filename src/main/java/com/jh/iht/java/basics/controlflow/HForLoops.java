package com.jh.iht.java.basics.controlflow;

public class HForLoops {
    // Method to sum numbers from 1 to n using a for loop
    public int sumUsingForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}