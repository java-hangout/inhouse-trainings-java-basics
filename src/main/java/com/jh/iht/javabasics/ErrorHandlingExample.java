package com.jh.iht.javabasics;

public class ErrorHandlingExample {

    // Method to demonstrate types of errors
    public static String demonstrateErrors(int a, int b) {
        // Debugging: Print values to trace the flow
        System.out.println("Debugging: a = " + a + ", b = " + b);

        // Common syntax error (missing semicolon here will cause compilation error)
        // int sum = a + b (syntax error: semicolon is missing)

        // Compilation error: Uncommenting the above line will throw a syntax error.
        int sum = a + b; // Correct syntax

        // Runtime error: Division by zero (handled)
        if (b == 0) {
            return "Error: Division by zero";
        }
        
        int result = sum / b; // Possible runtime error: division by zero
        return "Result: " + result;
    }

    // Main method to run the example
    public static void main(String[] args) {
        System.out.println(demonstrateErrors(10, 2));  // Correct input, no errors
        System.out.println(demonstrateErrors(10, 0));  // Runtime error: division by zero
    }
}
