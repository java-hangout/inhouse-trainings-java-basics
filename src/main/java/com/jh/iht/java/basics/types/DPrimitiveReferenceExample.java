package com.jh.iht.java.basics.types;

public class DPrimitiveReferenceExample {

    // Method to demonstrate primitive types
    public int demonstratePrimitiveTypes(int a, int b) {
        int originalA = a;  // Save original value of a

        // Modify b
        b = 20;

        // Return the final state as a string that can be tested
        return b;  // Returning the modified value of b to validate
    }

    // Method to demonstrate reference types
    public String demonstrateReferenceTypes(String str1, String str2) {
        // Modify str2 to demonstrate reference type behavior
        str2 = "World";

        // Return the final state to validate
        return str2;  // Return modified str2 for validation
    }
}