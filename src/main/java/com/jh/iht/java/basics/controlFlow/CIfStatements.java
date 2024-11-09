package com.jh.iht.java.basics.controlFlow;

public class CIfStatements {
    // Method to check if a number is positive, negative, or zero
    public String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}