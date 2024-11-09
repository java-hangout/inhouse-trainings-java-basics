package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * 1. Creating a class `EncapsulationExample` with private fields `name` and `age`.
 * 2. Implementing **getter** and **setter** methods for these fields.
 * 3. Writing test cases to:
 * - Verify that the **setter methods** correctly set the values of `name` and `age`.
 * - Verify that the **getter methods** correctly return the expected values.
 */

public class CEncapsulationTest {
    @Test
    public void testEncapsulation() {
        CEncapsulationExample person = new CEncapsulationExample();
        person.setName("John");
        person.setAge(25);
        Assertions.assertEquals("John", person.getName());
        Assertions.assertEquals(25, person.getAge());
    }
}