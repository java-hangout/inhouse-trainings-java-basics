package com.jh.iht.javabasics.controlflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for If Statements, Ternary Operator, and Switch Statements.
 */
public class IfTernarySwitchStatementsTest {

    /**
     * Test Case: Test checkSign method.
     * Problem: Check if the number is positive, negative, or zero.
     * Input: num = -5
     * Expected Output: "Negative"
     */
    @Test
    public void testCheckSign() {
        String result = IfTernarySwitchStatements.checkSign(-5);
        assertEquals("Negative", result);
    }

    /**
     * Test Case: Test checkEvenOdd method.
     * Problem: Check if a number is even or odd using a ternary operator.
     * Input: num = 6
     * Expected Output: "Even"
     */
    @Test
    public void testCheckEvenOdd() {
        String result = IfTernarySwitchStatements.checkEvenOdd(6);
        assertEquals("Even", result);
    }

    /**
     * Test Case: Test getDayName method.
     * Problem: Get the name of the day based on the number.
     * Input: day = 4
     * Expected Output: "Wednesday"
     */
    @Test
    public void testGetDayName() {
        String result = IfTernarySwitchStatements.getDayName(4);
        assertEquals("Wednesday", result);
    }
}
