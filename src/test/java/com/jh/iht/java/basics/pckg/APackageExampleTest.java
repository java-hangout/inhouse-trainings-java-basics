package com.jh.iht.java.basics.pckg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of packages in Java for organizing classes.
 * Input:- Person object created with name "Alice" and age 25
 * Expected Output:- "Name: Alice, Age: 25"
 */
public class APackageExampleTest {

    @Test
    public void testPersonDetails() {
        Person p = new Person("Alice", 25);
        Assertions.assertEquals("Alice", p.getName());
        Assertions.assertEquals(25, p.getAge());
    }
}