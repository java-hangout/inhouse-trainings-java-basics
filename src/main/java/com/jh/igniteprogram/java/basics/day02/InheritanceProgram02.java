package com.jh.igniteprogram.java.basics.day02;

public class InheritanceProgram02 {

    // Base class
    public static class Animal {
        public String makeSound() {
            return "Some sound";
        }
    }

    // Derived class (extends Animal)
    public static class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof!";
        }
    }

    // Another derived class (extends Animal)
    public static class Cat extends Animal {
        @Override
        public String makeSound() {
            return "Meow!";
        }
    }

    public static String run(String animalType) {
        Animal animal;

        // Upcasting: Assigning subclass object to superclass reference
        if ("Dog".equals(animalType)) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        // Downcasting back to the specific type and comparing objects
        if (animal instanceof Dog) {
            return "It's a dog! Sound: " + animal.makeSound();
        } else {
            return "It's a cat! Sound: " + animal.makeSound();
        }
    }
}