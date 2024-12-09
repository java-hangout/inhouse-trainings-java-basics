package org.jh.iht.java.basics.day02;

public class InheritanceProgram01 {

    // Base class
    public static class Animal {
        private String name;  // Private field

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Method to describe the animal
        public String describe() {
            return "I am an animal, and my name is " + name;
        }
    }

    // Derived class (extends Animal)
    public static class Dog extends Animal {

        // Constructor
        public Dog(String name) {
            super(name);  // Call to base class constructor
        }

        // Overridden method
        @Override
        public String describe() {
            return "I am a dog, and my name is " + getName();
        }
    }

    public static String run(String name) {
        // Create Dog object and call describe method
        Dog dog = new Dog(name);
        return dog.describe();
    }
}