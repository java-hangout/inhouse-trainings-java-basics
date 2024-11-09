package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate comparison of objects using equals() and '=='.
 * Input: - Two Person objects with same name "Alice"
 * Expected Output:
 * - false for reference comparison
 * - true for logical equality
 */
public class FComparingObjectsTest {

    @Test
    public void testEqualsAndReferenceComparison() {
        Person3 p1 = new Person3("Alice");
        Person3 p2 = new Person3("Alice");

        Assertions.assertFalse(p1 == p2);  // Reference comparison, should be false
        Assertions.assertTrue(p1.equals(p2));  // Logical equality, should be true
    }
}