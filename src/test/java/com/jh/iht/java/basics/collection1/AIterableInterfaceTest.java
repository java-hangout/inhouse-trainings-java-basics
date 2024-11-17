package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement:
 * Define an Iterable interface allows collections to be iterated using the enhanced for loop.
 * This test checks if the collection of programming languages is correctly iterated.
 * Input:
 * - List of programming languages ["Java", "Python", "C++"]
 * Expected Output:
 * - "Java", "Python", "C++" printed in separate lines.
 */
public class AIterableInterfaceTest {

    @Test
    public void testIterable() {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        IterableInterface iterableInterface = new IterableInterface();
        StringBuilder actualOutput  = iterableInterface.getProgrammingLanguages(languages);
        String expectedOutput = "Java\nPython\nC++\n";
        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}