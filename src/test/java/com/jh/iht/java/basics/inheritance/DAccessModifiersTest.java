package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate different access modifiers in Java.
 * Input:- Person object with name "Alice" as public  and age 30 as private
 * Expected Output:- Name and age accessible via public methods and fields
 */
public class DAccessModifiersTest {

    @Test
    public void testAccessModifiers() {
        Person2 person = new Person2("Alice", 30);
        Assertions.assertEquals("Alice", person.name);
//         Assertions.assertEquals(30, person.age);  // Age is private, can't be accessed directly
    }
}