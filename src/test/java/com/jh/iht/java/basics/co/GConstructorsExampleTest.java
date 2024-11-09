package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate how constructors are used to initialize object attributes.
 * Input: - Person object with name "Alice" and age 30
 * Expected Output:- Name: Alice, Age: 30
 */
public class GConstructorsExampleTest {

    @Test
    public void testPersonConstructor() {
        Person person = new Person("Alice", 30);

        Assertions.assertEquals("Alice", person.name);
        Assertions.assertEquals(30, person.age);
    }
}