package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate inheritance by creating Dog class inheriting from Animal class.
 * <p>
 * Input:
 * - Dog object with name "Buddy"
 * <p>
 * Expected Output:
 * - "Buddy barks"
 */
public class AInheritanceExampleTest {

    @Test
    public void testDogSpeak() {
        Dog1 dog = new Dog1("Buddy");
        Assertions.assertEquals("Buddy barks", dog.speak()); // Should output: "Buddy barks"
    }
}