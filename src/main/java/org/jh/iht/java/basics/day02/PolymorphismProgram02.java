package org.jh.iht.java.basics.day02;

public class PolymorphismProgram02 {

    // Overloaded method that calculates the sum of two integers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Overloaded method that calculates the sum of three integers
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method that calculates the sum of two doubles
    public static double calculateSum(double a, double b) {
        return a + b;
    }

    public static String run(String methodType, int a, int b, int c) {
        int result;
        if ("int".equals(methodType)) {
            result = calculateSum(a, b);  // Calls the method with two integers
        } else if ("int3".equals(methodType)) {
            result = calculateSum(a, b, c);  // Calls the method with three integers
        } else {
            result = (int) calculateSum(a, b);  // Calls the method with two doubles
        }

        return "Sum is: " + result;
    }
}