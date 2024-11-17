package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Use switch-case to determine the day of the week, start with Monday.
 * Input:- int day = 3
 * Expected Output:- "Wednesday"
 */
public class FSwitchStatementsTest {

    @Test
    public void testGetThirdDayOfWeek() {
        FSwitchStatements ss = new FSwitchStatements();
        int day = 3;
        String expected = "Wednesday";  // Expected result: "Wednesday"
        Assertions.assertEquals(expected, ss.getDayOfWeek(day));
    }

    @Test
    public void testGetForthDayOfWeek() {
        FSwitchStatements ss = new FSwitchStatements();
        int day = 4;
        String expected = "Thursday";  // Expected result: "Wednesday"
        Assertions.assertEquals(expected, ss.getDayOfWeek(day));
    }

    @Test
    public void testGetInvalidDayOfWeek() {
        FSwitchStatements ss = new FSwitchStatements();
        int day = 8;
        String expected = "Invalid Day";  // Expected result: "Wednesday"
        Assertions.assertEquals(expected, ss.getDayOfWeek(day));
    }
}