package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate multiple inheritance through interfaces.
 * Input:- Dolphin object that implements Animal and Swimmer interfaces
 * Expected Output: - "Dolphin eats", "Dolphin swims"
 */
public class JMultipleInheritanceTest {

    @Test
    public void testDolphinBehavior() {
        Dolphin dolphin = new Dolphin();
        Assertions.assertEquals("Dolphin eats", dolphin.eat());  // Should output "Dolphin eats"
        Assertions.assertEquals("Dolphin swims", dolphin.swim());  // Should output "Dolphin swims"
    }
}