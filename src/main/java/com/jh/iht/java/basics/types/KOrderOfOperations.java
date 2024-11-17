package com.jh.iht.java.basics.types;

public class KOrderOfOperations {
    // Method to demonstrate the order of operations
    public int calculateOrderOfOperations(int a, int b, int c) {
        return a + b * c;  // Multiplication has higher precedence than addition
    }
}