package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Implement a method to sum two variables.
 * Input: int a = 7, int b = 3
 * Expected Output: The sum of the variables is 7 + 3 = 10.
 */

/**
 * @author Veeresh N
 * @version 1.0
 */

public class AAVariablesTest {

    @Test
    public void testSumVariables() {
        AVariables var = new AVariables();
        int a = 7;
        int b = 3;
        int expected = 10;  // Expected sum: 7 + 3 = 10
        Assertions.assertEquals(expected, var.sumVariables(a, b));
    }
}
