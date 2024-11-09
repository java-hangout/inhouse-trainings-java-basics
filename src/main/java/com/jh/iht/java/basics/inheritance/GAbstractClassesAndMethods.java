package com.jh.iht.java.basics.inheritance;

abstract class Animal4 {
    abstract String sound();  // Abstract method
}

class Dog4 extends Animal4 {
    @Override
    String sound() {
        System.out.println("Barks");
        return "Barks";
    }
}

public class GAbstractClassesAndMethods {
    public static void main(String[] args) {
        Animal4 dog = new Dog4();
        dog.sound();  // Outputs: Barks
    }
}