package com.jh.iht.java.basics.co;

abstract class Animal {
    public abstract String sound(); // Abstract method
}

class Dog extends Animal {
    @Override
    public String sound() {
        System.out.println("Dog barks");
        return "Dog barks";
    }
}

class Cat extends Animal {
    @Override
    public String sound() {
        System.out.println("Cat meows");
        return "Cat meows";
    }
}

public class DAbstractionExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Outputs: Dog barks

        Animal cat = new Cat();
        cat.sound(); // Outputs: Cat meows
    }
}