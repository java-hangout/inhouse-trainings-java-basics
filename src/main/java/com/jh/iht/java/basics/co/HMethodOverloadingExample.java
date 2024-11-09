package com.jh.iht.java.basics.co;

class Calculator {
    // Overloaded method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class HMethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Sum of integers: " + calculator.add(2, 3));   // Uses int version
        System.out.println("Sum of doubles: " + calculator.add(2.5, 3.5)); // Uses double version
        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3)); // Uses three int version
    }
}