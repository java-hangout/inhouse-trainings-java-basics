package com.jh.igniteprogram.java.basics.day01;

public class ControlFlowProgram03 {

    public static String run(int number) {
        String result;
        
        // Using if statement
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        // Using ternary operator
        result += " and " + (number < 0 ? "Negative" : "Positive");

        return result;
    }
}