package com.jh.iht.java.basics.controlFlow;

public class IWhileLoops {
    // Method to sum numbers from 1 to n using a while loop
    public int sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
}