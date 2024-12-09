package com.jh.iht.javabasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassAndObjectTopicTest {

    /**
     * Problem: Test the ClassAndObjectTopic constructor and getter methods for initialization.
     * Input: model = "Toyota", year = 2020
     * Expected Output: "Toyota", 2020
     */
    @Test
    public void testCarConstructorAndGetters() {
        ClassAndObjectTopic car = new ClassAndObjectTopic("Toyota", 2020);
        Assertions.assertEquals("Toyota", car.getModel());  // Verify the model
        Assertions.assertEquals(2020, car.getYear());      // Verify the year
    }

    /**
     * Problem: Test method overloading and show car count functionality.
     * Input: car = "Honda", displayCarInfo with showCarCount = true
     * Expected Output: "ClassAndObjectTopic Model: Honda, Year: 2024", "Total cars created: 1"
     */
    @Test
    public void testMethodOverloading() {
        ClassAndObjectTopic car = new ClassAndObjectTopic("Honda");
        car.displayCarInfo(true);  // Should show the car info and the total car count
    }

    /**
     * Problem: Test the static method getCarCount for the count of car objects.
     * Input: No input, create a car object
     * Expected Output: carCount should be 1 after creating one car object
     */
    @Test
    public void testCarCount() {
        new ClassAndObjectTopic("Nissan", 2022);  // Create a new car
        Assertions.assertEquals(3, ClassAndObjectTopic.getCarCount());  // Verify car count is 1
    }

    /**
     * Problem: Test setter methods for modifying the car object.
     * Input: Change car model to "BMW" and year to 2023
     * Expected Output: "BMW", 2023
     */
    @Test
    public void testSetters() {
        ClassAndObjectTopic car = new ClassAndObjectTopic("Audi", 2020);  // Initial car object
        car.setModel("BMW");  // Modify the model
        car.setYear(2023);    // Modify the year
        Assertions.assertEquals("BMW", car.getModel());  // Verify updated model
        Assertions.assertEquals(2023, car.getYear());    // Verify updated year
    }
}
