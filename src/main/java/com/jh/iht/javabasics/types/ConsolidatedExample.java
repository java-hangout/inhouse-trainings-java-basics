package com.jh.iht.javabasics.types;

public class ConsolidatedExample {

    // Method for adding two integers (Variables and Primitive Types)
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method for adding two primitive integers (Primitive Types)
    public static int addPrimitive(int a, int b) {
        return a + b;
    }

    // Method for calculating arithmetic expression (a * b + 10)
    public static double calculateExpression(int a, int b) {
        return (a * b) + 10;
    }

    // Method for concatenating two strings (Reference Types)
    public static String concatenateStrings(String a, String b) {
        return a + b;
    }

    // Method to demonstrate escape sequences (Escape Sequences)
    public static String escapeSequences() {
        return "Hello\nWorld!\tTab\tBackslash";
    }

    // Method for doubling the values in an array (Arrays)
    public static int[] doubleArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }

    // Method for summing all elements in a 2D array (Multi-dimensional Arrays)
    public static int sum2DArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // Constant value (Constants)
    public static final int CONSTANT_VALUE = 100;

    // Method to return the constant value
    public static int getConstantValue() {
        return CONSTANT_VALUE;
    }

    // Main method for running the program independently (Optional, not part of tests)
    public static void main(String[] args) {
        // Sample method calls (could be used for testing manually if needed)
        System.out.println("Sum of 5 and 3: " + sum(5, 3));
        System.out.println("Primitive addition of 10 and 5: " + addPrimitive(10, 5));
        System.out.println("Expression result of (5 * 4 + 10): " + calculateExpression(5, 4));
        System.out.println("Concatenation of 'Java' and 'Rocks': " + concatenateStrings("Java", "Rocks"));
        System.out.println("Escape sequences output: " + escapeSequences());
        
        // Example of using arrays
        int[] array = {1, 2, 3};
        int[] doubledArray = doubleArrayValues(array);
        System.out.print("Doubled array: ");
        for (int num : doubledArray) {
            System.out.print(num + " ");
        }
        
        // Example of using 2D array
        int[][] array2D = {{1, 2}, {3, 4}};
        System.out.println("\nSum of 2D array elements: " + sum2DArray(array2D));
        
        // Accessing constant value
        System.out.println("Constant value: " + getConstantValue());
    }
}
