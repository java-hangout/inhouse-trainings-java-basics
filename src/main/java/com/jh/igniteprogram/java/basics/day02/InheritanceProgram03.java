package com.jh.igniteprogram.java.basics.day02;

public class InheritanceProgram03 {

    // Abstract class (cannot be instantiated)
    public static abstract class Animal {
        public abstract String makeSound();
    }

    // Final class (cannot be inherited)
    public static final class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof!";
        }
    }

    // Another class that inherits from Animal
    public static class Cat extends Animal {
        @Override
        public String makeSound() {
            return "Meow!";
        }
    }

    // Method demonstrating final class, abstract classes, and multiple inheritance
    public static String run(String animalType) {
        Animal animal;

        // Based on input, instantiate either Dog or Cat
        if ("Dog".equals(animalType)) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        // Returning the sound made by the selected animal
        return animal.makeSound();
    }
}