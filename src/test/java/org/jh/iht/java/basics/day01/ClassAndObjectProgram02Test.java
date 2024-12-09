package org.jh.iht.java.basics.day01;

import org.jh.iht.java.basics.day01.ClassAndObjectProgram02;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassAndObjectProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly sets and gets the values of the Book object using getters and setters.
     *
     * Input:
     * title = "Java Programming", author = "James Gosling"
     *
     * Expected Output:
     * "Title: Java Programming, Author: James Gosling"
     */

    @Test
    public void testRun() {
        String title = "Java Programming", author = "James Gosling";
        // Run the method with input values
        String result = ClassAndObjectProgram02.run(title, author);

        // Assert the expected result
        String expected = "Title: " + title + ", Author: " + author;
        assertEquals(expected, result);
    }
}