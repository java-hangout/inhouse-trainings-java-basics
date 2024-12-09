package org.jh.iht.java.basics.day01;

public class ClassAndObjectProgram04 {

    // Static variable to demonstrate static members
    public static class Counter {
        private static int count = 0;

        // Static method to increment and get the count
        public static void incrementCount() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }

    // Method to show reducing coupling using static method
    public static String run() {
        Counter.incrementCount();
        Counter.incrementCount();
        
        // Returning the current count value
        return "Current count: " + Counter.getCount();
    }
}