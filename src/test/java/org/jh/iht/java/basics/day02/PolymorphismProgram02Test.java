package org.jh.iht.java.basics.day02;

import org.jh.iht.java.basics.day02.PolymorphismProgram02;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolymorphismProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates method overloading.
     * The correct overloaded method should be invoked based on the number of arguments.
     *
     * Input:
     * methodType = "int3", a = 2, b = 3, c = 4
     *
     * Expected Output:
     * "Sum is: 9"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = PolymorphismProgram02.run("int3", 2, 3, 4);

        // Assert the expected result
        String expected = "Sum is: 9";
        assertEquals(expected, result);
    }
}