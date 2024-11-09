package com.jh.iht.java.basics.string;

public class ImmutableStringExample {

    // Method to demonstrate the immutability of String in Java
    public String demonstrateImmutableString() {
        String str1 = "Hello";
        String str2 = str1;  // str2 points to the same reference as str1

        // Modify str1
        str1 = str1.concat(" World");

        // Return both strings for validation in test
        return str1 + ";" + str2;  // Will return "Hello World;Hello"
    }
}
