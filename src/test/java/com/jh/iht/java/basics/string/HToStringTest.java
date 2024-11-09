package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the use of the toString() method to return a custom string representation of an object.
Input:
    - A Person object with name "John" and age 30.
Expected Output:
    - The string representation should be "Person [name=John, age=30]".
*/

public class HToStringTest {

    @Test
    void testToString() {
        Person person = new Person("John", 30);
        
        // Validate the custom toString() representation
        assertEquals("Person [name=John, age=30]", person.toString());
    }
}
