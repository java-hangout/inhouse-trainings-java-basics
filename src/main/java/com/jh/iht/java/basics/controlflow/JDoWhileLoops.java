package com.jh.iht.java.basics.controlflow;

public class JDoWhileLoops {
    // Method to sum numbers from 1 to n using a do-while loop
    public int sumUsingDoWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        return sum;
    }
}