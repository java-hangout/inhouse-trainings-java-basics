package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate constructor overloading with different constructor signatures.
 * Input:
 * - Person object with no parameters: Defaults to "Unknown" and age 0
 * - Person object with parameters: "John" and 25
 * Expected Output:
 * - Name: Unknown, Age: 0
 * - Name: John, Age: 25
 */
public class IConstructorOverloadingTest {

    @Test
    public void testDefaultConstructor() {
        Person1 person = new Person1();
        Assertions.assertEquals("Unknown", person.name);
        Assertions.assertEquals(0, person.age);
    }

    @Test
    public void testParameterizedConstructor() {
        Person1 person = new Person1("John", 25);
        Assertions.assertEquals("John", person.name);
        Assertions.assertEquals(25, person.age);
    }
}