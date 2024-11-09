package com.jh.iht.java.basics.types;

public class DPrimitiveVsReferenceTypes {
    // Method to demonstrate primitive types
    public void demonstratePrimitiveTypes() {
        int a = 10;  // Primitive type
        int b = a;   // b gets the value of a, it's a copy

        System.out.println("Primitive Type Example:");
        System.out.println("Value of a: " + a); // 10
        System.out.println("Value of b: " + b); // 10

        b = 20;  // Changing b does not affect a
        System.out.println("After modifying b:");
        System.out.println("Value of a: " + a); // 10
        System.out.println("Value of b: " + b); // 20
    }

    // Method to demonstrate reference types
    public void demonstrateReferenceTypes() {
        String str1 = "Hello";  // Reference type
        String str2 = str1;     // str2 references the same object as str1

        System.out.println("\nReference Type Example:");
        System.out.println("str1: " + str1);  // "Hello"
        System.out.println("str2: " + str2);  // "Hello"

        // Modify str2
        str2 = "World";  // This makes str2 reference a new object, str1 remains unchanged
        System.out.println("After modifying str2:");
        System.out.println("str1: " + str1);  // "Hello"
        System.out.println("str2: " + str2);  // "World"
    }
}