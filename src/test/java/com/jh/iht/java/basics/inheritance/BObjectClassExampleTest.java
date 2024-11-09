package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate Object class methods like equals() and toString().
 * Input:- Two Person objects with names "Alice" and "Bob"
 * Expected Output:
 * - Person{name='Alice'} for toString
 * - true for equals between two persons with same name
 * - false for equals between two persons with different names
 */
public class BObjectClassExampleTest {

    @Test
    public void testToString() {
        Person1 p1 = new Person1("Alice");
        Assertions.assertEquals("Person{name='Alice'}", p1.toString());
    }

    @Test
    public void testEquals() {
        Person1 p1 = new Person1("Alice");
        Person1 p2 = new Person1("Alice");
        Person1 p3 = new Person1("Bob");

        Assertions.assertTrue(p1.equals(p2));  // Same name, should return true
        Assertions.assertFalse(p1.equals(p3));  // Different name, should return false
    }
}