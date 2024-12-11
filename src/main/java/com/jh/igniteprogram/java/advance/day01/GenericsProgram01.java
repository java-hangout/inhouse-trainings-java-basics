package com.jh.igniteprogram.java.advance.day01;

public class GenericsProgram01 {

    // A method demonstrating generics with constraints
    public static <T extends Number> String run(T num1, T num2) {
        // Calculate the sum of the two numbers
        double sum = num1.doubleValue() + num2.doubleValue();
        // Prepare the result message
        String result = "The sum of " + num1 + " and " + num2 + " is " + sum;
        System.out.println(result);
        // Return the formatted output as a string
        return result;
    }

    // A poor solution without generics
    public static String runWithoutGenerics(Object num1, Object num2) {
        if (num1 instanceof Number && num2 instanceof Number) {
            double sum = ((Number) num1).doubleValue() + ((Number) num2).doubleValue();
            return "The sum of " + num1 + " and " + num2 + " is " + sum;
        }
        return "Invalid input types!";
    }
}
