package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;

import java.util.Collections;
import java.util.List;


/**
 * Problem Statement:
 * The Comparator interface allows defining custom sorting logic. 
 * This test verifies that people are correctly sorted by name using a comparator.
 * 
 * Input:
 * - List of persons: Alice (30), Bob (25), Charlie (35)
 * 
 * Expected Output:
 * - Sorted by name: Alice (30), Bob (25), Charlie (35)
 */
public class FComparatorInterfaceTest {

    @org.junit.jupiter.api.Test
    public void testComparator() {
        ComparatorInterface comparatorInterface = new ComparatorInterface();
        List<Person1> people = comparatorInterface.getPeople();

        // Sort people by name using the Comparator
        Collections.sort(people, comparatorInterface.sortByName());

        // Check the sorted order by name
        Assertions.assertEquals("Alice: 30", people.get(0).toString());
        Assertions.assertEquals("Bob: 25", people.get(1).toString());
        Assertions.assertEquals("Charlie: 35", people.get(2).toString());
    }
}

