package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of static members in a class.
 * Input: - Counter objects created using the constructor
 * Expected Output: - Number of Counter objects created = 3
 */
public class JStaticMembersTest {

    @Test
    public void testStaticCount() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Static count should be 3 after three objects are created
        Assertions.assertEquals(3, Counter.getCount());
    }
}