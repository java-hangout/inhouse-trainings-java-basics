package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate deep inheritance hierarchy with Class and method as "Animal eats", "Mammal walks", "Dog barks".
 * Animal eats
 * |- Mammal walks
 * ||- Dog barks
 * Input: - Dog object
 * Expected Output: - "Animal eats", "Mammal walks", "Dog barks"
 */
public class IDeepInheritanceHierarchyTest {

    @Test
    public void testDogBehavior() {
        Dog5 dog = new Dog5();
        Assertions.assertEquals("Animal eats", dog.eat());  // Inherited from Animal - should output "Animal eats"
        Assertions.assertEquals("Mammal walks", dog.walk());  // Inherited from Mammal - should output "Mammal walks"
        Assertions.assertEquals("Dog barks", dog.bark());  // Should output "Dog barks"
    }
}