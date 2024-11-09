package com.jh.iht.java.basics.controlFlow;

public class FSwitchStatements {
    // Method to return day of the week based on the number
    public String getDayOfWeek(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid Day";
        }
    }
}