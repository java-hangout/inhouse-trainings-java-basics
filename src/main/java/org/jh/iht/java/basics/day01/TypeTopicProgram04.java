package org.jh.iht.java.basics.day01;

public class TypeTopicProgram04 {
    public static final int CONSTANT_VALUE = 100;
    public static int counter = 0;

    public static String run(int increment) {
        // Increment the static counter by the input value
        counter += increment;
        // Return the formatted output as a string
        return "Counter: " + counter + "\nConstant Value: " + CONSTANT_VALUE;
    }
}