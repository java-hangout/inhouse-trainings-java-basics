package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate loose coupling between Car and Engine classes.
 * Input:- Car object that uses Engine object to start.
 * Expected Output:- "Engine started" when Car starts.
 */
public class ECouplingExampleTest {

    @Test
    public void testCarStart() {
        Engine2 engine = new Engine2();
        Car2 car = new Car2(engine);
        Assertions.assertEquals("Engine started", car.startCar());  // Should output "Engine started"
    }
}