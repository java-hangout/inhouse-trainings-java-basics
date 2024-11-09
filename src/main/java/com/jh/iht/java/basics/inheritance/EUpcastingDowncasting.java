package com.jh.iht.java.basics.inheritance;

class Animal3 {
    public String speak() {
        System.out.println("Animal speaks");
        return "Animal speaks";
    }
}

class Dog3 extends Animal3 {
    public String speak() {
        System.out.println("Dog barks");
        return "Dog barks";
    }
}

public class EUpcastingDowncasting {
    public static void main(String[] args) {
        Animal3 animal = new Dog3();  // Upcasting
        animal.speak();  // Outputs: Dog barks

        Dog3 dog = (Dog3) animal;  // Downcasting
        dog.speak();  // Outputs: Dog barks
    }
}