package com.jh.igniteprogram.java.advance.day01;

public class LambdaFunctional01 {

    // Functional Interface
    @FunctionalInterface
    public interface Greeting {
        String greet(String name);
    }

    // Run method demonstrating Functional Interface, Anonymous Inner Class, and Lambda Expression
    public static String run(String name) {
        // Using an anonymous inner class
        Greeting greeting1 = new Greeting() {
            public String greet(String name) {
                return "Hello, " + name;
            }
        };

        // Using a lambda expression
        Greeting greeting2 = (inputName) -> "Hello, " + inputName;

        // Example output using both approaches
        String result1 = greeting1.greet(name);
        String result2 = greeting2.greet(name);

        return result1 + " | " + result2;
    }
}
