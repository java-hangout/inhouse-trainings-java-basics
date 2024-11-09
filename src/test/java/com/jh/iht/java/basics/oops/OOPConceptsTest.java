package com.jh.iht.java.basics.oops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the four main principles of OOP: Encapsulation, Inheritance, Polymorphism, and Abstraction.
 *
 * Input:
 * - Car object: Model = "Tesla Model X", Year = 2023
 * - ElectricCar object: Model = "Tesla Model S", Year = 2023, Battery Capacity = 100 kWh
 * - Animal sound examples: Dog, Cat, and Animal
 * - Shape drawing: Circle and Rectangle
 * 
 * Expected Output:
 * - Car details printed: "Model: Tesla Model X, Year: 2023"
 * - Electric car details printed with battery capacity
 * - Animal sound examples: Animal, Dog barks, Cat meows
 * - Shape drawing: Circle and Rectangle
 */
public class OOPConceptsTest {

    @Test
    public void testEncapsulation() {
        Car car = new Car();
        car.setModel("Tesla Model X");
        car.setYear(2023);
        
        Assertions.assertEquals("Tesla Model X", car.getModel());
        Assertions.assertEquals(2023, car.getYear());
    }

    @Test
    public void testInheritance() {
        ElectricCar electricCar = new ElectricCar();
        electricCar.setModel("Tesla Model S");
        electricCar.setYear(2023);
        electricCar.setBatteryCapacity(100);
        
        Assertions.assertEquals("Tesla Model S", electricCar.getModel());
        Assertions.assertEquals(2023, electricCar.getYear());
    }

    @Test
    public void testPolymorphism() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        /*Assertions.assertEquals("Animal makes a sound", animal.sound());  // Polymorphism demonstration
        Assertions.assertEquals("Dog barks", dog.sound());
        Assertions.assertEquals("Cat meows", cat.sound());*/
    }

    @Test
    public void testAbstraction() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
       /* Assertions.assertEquals("Drawing a Circle", circle.draw());  // Abstract method implementation in Circle class
        Assertions.assertEquals("Drawing a Rectangle", rectangle.draw()); */ // Abstract method implementation in Rectangle class
    }
}