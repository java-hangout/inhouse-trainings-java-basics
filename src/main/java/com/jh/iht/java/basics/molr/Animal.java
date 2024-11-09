package com.jh.iht.java.basics.molr;

// Superclass Animal
class Animal {
    public String makeSound() {
        System.out.println("Animal makes sound");
        return "Animal makes sound";
    }
}

// Subclass Dog that overrides the makeSound method
class Dog extends Animal {
    @Override
    public String makeSound() {
        System.out.println("Dog barks");
        return "Dog barks";
    }
}