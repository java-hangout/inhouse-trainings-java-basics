package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate abstraction using an abstract class and concrete subclasses.
 * Input:- Animal object: Dog and Cat
 * Expected Output:
 *  - Dog barks
 *  - Cat meows
 */
public class DAbstractionExampleTest {

    @Test
    public void testSound() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // Testing polymorphism and abstraction
        Assertions.assertEquals("Dog barks",dog.sound());  // Should output "Dog barks"
        Assertions.assertEquals("Cat meows",cat.sound());  // Should output "Cat meows"
    }
}