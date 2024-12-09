package com.jh.iht.javabasics.controlflow;

public class IfTernarySwitchStatements {

    // If Statements: Check if a number is positive or negative
    public static String checkSign(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Ternary Operator: Check if a number is even or odd
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // Switch Statement: Return the name of the day for a given day number
    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid day";
        }
    }
}
