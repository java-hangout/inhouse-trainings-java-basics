package com.jh.iht.java.basics.controlflow;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Check if the number is positive, negative, or zero.
 * Input: - int num = 5
 * Expected Output: - "Positive"
 */
public class CIfStatementsTest {

    @Test
    public void testCheckPositiveNumber() {
        CIfStatements ifStmt = new CIfStatements();
        int num = 5;
        String expected = "Positive";
        Assertions.assertEquals(expected, ifStmt.checkNumber(num));
    }
    @Test
    public void testCheckNegativeNumber() {
        CIfStatements ifStmt = new CIfStatements();
        int num = -5;
        String expected = "Negative";
        Assertions.assertEquals(expected, ifStmt.checkNumber(num));
    }
}