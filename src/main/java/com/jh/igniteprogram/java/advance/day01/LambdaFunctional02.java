package com.jh.igniteprogram.java.advance.day01;

public class LambdaFunctional02 {

    // Functional Interface
    @FunctionalInterface
    public interface Multiply {
        int multiply(int a, int b);
    }

    // Run method demonstrating Method References and Variable Capture
    public static int run(int a, int b) {
        // Using method reference
        Multiply multiply1 = LambdaFunctional02::multiplyMethod;
        
        // Using lambda expression
        Multiply multiply2 = (x, y) -> x * y;

        // Calculating results
        int result1 = multiply1.multiply(a, b);
        int result2 = multiply2.multiply(a, b);

        return result1 + result2;
    }

    // Method for method reference
    public static int multiplyMethod(int a, int b) {
        return a * b;
    }
}
