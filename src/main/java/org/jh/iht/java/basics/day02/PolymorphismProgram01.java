package org.jh.iht.java.basics.day02;

public class PolymorphismProgram01 {

    // Base class
    public static class Animal {
        public String sound() {
            return "Some generic animal sound";
        }
    }

    // Derived class (overriding the sound method)
    public static class Dog extends Animal {
        @Override
        public String sound() {
            return "Woof!";  // Overridden method
        }
    }

    // Another derived class (overriding the sound method)
    public static class Cat extends Animal {
        @Override
        public String sound() {
            return "Meow!";  // Overridden method
        }
    }

    public static String run(String animalType) {
        Animal animal;

        // Using dynamic binding: the method call resolves at runtime based on the actual object type
        if ("Dog".equals(animalType)) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        return animal.sound();
    }
}