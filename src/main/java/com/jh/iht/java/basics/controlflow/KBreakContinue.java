package com.jh.iht.java.basics.controlflow;

public class KBreakContinue {
    // Method to return a list of even numbers from 1 to n, using continue
    public String listEvenNumbers(int n) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;  // Skip odd numbers
            }
            evenNumbers.append(i).append(" ");
        }
        return evenNumbers.toString();
    }
}