package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of final classes and methods.
 * Input:
 * - FinalClass object
 * Expected Output:
 * - "Final class method" from speak() method
 */
public class HFinalClassesAndMethodsTest {

    @Test
    public void testFinalClass() {
        FinalClass obj = new FinalClass();
        Assertions.assertEquals("Final class method",obj.speak());  // Should output "Final class method"
    }
}