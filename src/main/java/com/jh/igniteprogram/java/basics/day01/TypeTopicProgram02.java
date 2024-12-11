package com.jh.igniteprogram.java.basics.day01;

public class TypeTopicProgram02 {
    public static String run(String name) {
        // Concatenate greeting message with the provided name
        String greeting = "Hello, " + name + "!";

        // Convert the greeting message to uppercase
        greeting = greeting.toUpperCase();

        // Return the final uppercase greeting
        return greeting;
    }
}