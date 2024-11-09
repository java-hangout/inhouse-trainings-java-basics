package com.jh.iht.java.basics.pckg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate encapsulation by restricting access to private fields 
 * and providing getter and setter methods for controlled access.
 * Input:
 * - Person object with initial name "Alice" and age 30.
 * - Setter method to change name and age.
 * - Attempt to set an invalid age.
 * Expected Output:
 * - Name and age can be accessed and modified through getter and setter methods.
 * - Invalid age setting should result in an error message.
 */
public class CEncapsulationTest {

    @Test
    public void testEncapsulation() {
        // Create a new person object
        Person2 person = new Person2("Alice", 30);

        // Test getter methods
        Assertions.assertEquals("Alice", person.getName());
        Assertions.assertEquals(30, person.getAge());

        // Test setter methods
        person.setName("Bob");
        person.setAge(35);

        // Test updated values
        Assertions.assertEquals("Bob", person.getName());
        Assertions.assertEquals(35, person.getAge());

        // Test invalid age (negative value)
        person.setAge(-5);  // Age should not be negative
        Assertions.assertEquals(35, person.getAge());  // Age should remain 35
    }
}