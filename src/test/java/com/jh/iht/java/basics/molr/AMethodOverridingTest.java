package com.jh.iht.java.basics.molr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Problem Statement: Demonstrate method overriding by creating a superclass Animal and a subclass Dog.
Input:
    - Animal object.
    - Dog object (subclass of Animal).
Expected Output:
    - Animal's makeSound() should print "Animal makes sound".
    - Dog's makeSound() should print "Dog barks".
*/
public class AMethodOverridingTest {

    @Test
    public void testAnimalMakeSound() {
        Animal animal = new Animal();
        Assertions.assertEquals("Animal makes sound",animal.makeSound());  // Expected output: "Animal makes sound"
    }

    @Test
    public void testDogMakeSound() {
        Animal dog = new Dog(); // Dog is an instance of Animal
        Assertions.assertEquals("Dog barks",dog.makeSound());  // Expected output: "Dog barks"
    }
}