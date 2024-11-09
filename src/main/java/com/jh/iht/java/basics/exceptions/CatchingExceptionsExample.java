package com.jh.iht.java.basics.exceptions;

// Class to demonstrate catching exceptions
class Division {
    public int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}

public class CatchingExceptionsExample {
    public static void main(String[] args) {
        Division division = new Division();
        
        try {
            int result = division.divide(10, 2);  // Expected: 5
            System.out.println("Result: " + result);
            result = division.divide(10, 0);  // Should throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Expected output: Cannot divide by zero.
        }
    }
}