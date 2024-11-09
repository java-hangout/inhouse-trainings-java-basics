package com.jh.iht.java.basics.types;

public class MMathClass {
    // Method to demonstrate some Math class methods (round, sqrt, and pow)
    public double computeMathOperations(double a, double b) {
        double result = Math.pow(a, b); // a raised to the power of b
        result += Math.sqrt(a); // Add square root of a
        result = Math.round(result); // Round the result
        return result;
    }
}