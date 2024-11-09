package com.jh.iht.java.basics.controlFlow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Use switch-case to determine the day of the week.
 * 
 * Input:
 * - int day = 3
 * 
 * Expected Output:
 * - "Wednesday"
 */
public class FSwitchStatementsTest {

    @Test
    public void testGetDayOfWeek() {
        FSwitchStatements ss = new FSwitchStatements();
        int day = 3;
        String expected = "Wednesday";  // Expected result: "Wednesday"
        Assertions.assertEquals(expected, ss.getDayOfWeek(day));
    }
}