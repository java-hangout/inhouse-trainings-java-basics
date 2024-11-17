package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Statement:
 * The Comparable interface allows objects to be compared and sorted. 
 * This test verifies that people are correctly sorted by age.
 * Input:
 * - List of persons: Alice (30), Bob (25), Charlie (35)
 * Expected Output:
 * - Sorted by age: Bob (25), Alice (30), Charlie (35)
 */
public class EComparableInterfaceTest {

    @Test
    public void testComparable() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        ComparableInterface comparableInterface = new ComparableInterface();
        List<Person> result = comparableInterface.getPeople(people);

        // Check the sorted order by age
        Assertions.assertEquals("Bob: 25", result.get(0).toString());
        Assertions.assertEquals("Alice: 30", result.get(1).toString());
        Assertions.assertEquals("Charlie: 35", result.get(2).toString());
    }
}