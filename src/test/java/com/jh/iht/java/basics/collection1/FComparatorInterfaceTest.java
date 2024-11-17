package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Problem Statement:
 * The Comparator interface allows defining custom sorting logic. 
 * This test verifies that people are correctly sorted by name using a comparator.
 * Input: - List of persons: Bob (25), Alice (30), Charlie (35)
 * Expected Output: - Sorted by name: Alice (30), Bob (25), Charlie (35)
 */
public class FComparatorInterfaceTest {

    @org.junit.jupiter.api.Test
    public void testComparator() {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Bob", 25));
        people.add(new Person1("Alice", 30));
        people.add(new Person1("Charlie", 35));
//        System.out.print(people);
        ComparatorInterface comparatorInterface = new ComparatorInterface();
        List<Person1> exceptedResult = comparatorInterface.getPeople(people);
        // Check the sorted order by name
        Assertions.assertEquals("Alice: 30", exceptedResult.get(0).toString());
        Assertions.assertEquals("Bob: 25", exceptedResult.get(1).toString());
        Assertions.assertEquals("Charlie: 35", exceptedResult.get(2).toString());
    }
}

