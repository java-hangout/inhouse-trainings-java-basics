package com.jh.igniteprogram.java.advance.day01;

public class DesignPattern01 {

    // Singleton pattern: Ensure only one instance of the class
    private static DesignPattern01 instance;

    // Private constructor to prevent instantiation
    private DesignPattern01() {}

    // Public method to provide access to the instance
    public static DesignPattern01 getInstance() {
        if (instance == null) {
            instance = new DesignPattern01();
        }
        return instance;
    }

    // Method to demonstrate some functionality
    public String run(String input) {
        return "Singleton instance received: " + input;
    }
}
