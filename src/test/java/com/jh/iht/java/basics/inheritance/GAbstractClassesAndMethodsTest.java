package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate abstract classes and abstract methods in Java.
 * Input:- Dog object
 * Expected Output:- "Barks" from Dog's implementation of abstract method sound()
 */
public class GAbstractClassesAndMethodsTest {

    @Test
    public void testSound() {
        Animal4 dog = new Dog4();
        Assertions.assertEquals("Barks", dog.sound());  // Should output "Barks"
    }
}