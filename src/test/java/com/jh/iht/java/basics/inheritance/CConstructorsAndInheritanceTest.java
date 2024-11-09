package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate constructor chaining between superclass
 * Animal with a parameterised constructor and subclass Dog with a parameterised constructor.
 * Input: - Dog object with name "Buddy"
 * Expected Output: Constructor calls for Animal first, then Dog
 */
public class CConstructorsAndInheritanceTest {

    @Test
    public void testConstructorChaining() {
        Dog2 dog = new Dog2("Buddy");
        // Outputs: "Animal constructor called" followed by "Dog constructor called"
    }
}