package com.jh.iht.java.basics.pckg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * Problem: Demonstrate access modifiers in Java (public, private, protected, and default).
 * Input: - Person object created with name "John", age 30, address "123 Main St", and city "New York"
 * Expected Output:
 * - Accessible fields should be returned as expected
 * - private fields should not be accessible
 */
public class BAccessModifiersTest {

    @Test
    public void testPublicAccess() {
        Person1 p = new Person1("John", 30, "123 Main St", "New York");
        Assertions.assertEquals("John", p.name);  // Public field
    }

    @Test
    void testPrivateAccess() {
        Person1 p = new Person1("John", 30, "123 Main St", "New York");

        // Test that accessing a private field directly via reflection throws IllegalAccessException
        IllegalAccessException thrown = Assertions.assertThrows(IllegalAccessException.class, () -> {
            // Try to access the private field 'age' directly using reflection
            Field field = Person1.class.getDeclaredField("age");
            //field.setAccessible(false); // Simulate the access control by not allowing access
            field.get(p); // This should throw IllegalAccessException because field is private and we haven't set accessible
        });
        Assertions.assertEquals("class com.jh.iht.java.basics.pckg.BAccessModifiersTest cannot access a member of class com.jh.iht.java.basics.pckg.Person1 with modifiers \"private\"", thrown.getMessage());
    }

    @Test
    public void testProtectedAccess() {
        Person1 p = new Person1("John", 30, "123 Main St", "New York");
        Assertions.assertEquals("123 Main St", p.address);  // Protected field
    }

    @Test
    public void testDefaultAccess() {
        Person1 p = new Person1("John", 30, "123 Main St", "New York");
        Assertions.assertEquals("New York", p.city);  // Default access field
    }
}