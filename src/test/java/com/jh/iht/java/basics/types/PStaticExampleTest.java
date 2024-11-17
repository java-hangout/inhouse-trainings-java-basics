package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Problem statement: Create class with a static variable as count =0 and static method which will return
 * increment value of count.
 * Expected Output:- After calling incrementCount, the static count should be 1.
 */
public class PStaticExampleTest {

    @Test
    public void testStaticMethod() {
        PStaticExample.incrementCount();
        int expected = 1;  // Expected count after incrementing once
        assertEquals(expected, PStaticExample.getCount());
    }
}