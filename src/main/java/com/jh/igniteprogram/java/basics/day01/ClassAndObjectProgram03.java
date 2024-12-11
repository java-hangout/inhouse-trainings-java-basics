package com.jh.igniteprogram.java.basics.day01;

public class ClassAndObjectProgram03 {

    // Abstract class to demonstrate abstraction
    public static  class Animal {
        public  String makeSound(){
            return "Sound";
        };
    }

    // Concrete class inheriting from Animal
    public static class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof!";
        }
    }

    // Constructor Overloading
    public static class Rectangle {
        int length;
        int breadth;

        // Constructor to initialize with both length and breadth
        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        // Constructor to initialize with a square (length = breadth)
        public Rectangle(int side) {
            this.length = side;
            this.breadth = side;
        }

        // Method to calculate area
        public int area() {
            return length * breadth;
        }
    }

    public static String run(String animalType, int side) {
        // Demonstrating Abstraction (using Dog object)
        Animal animal;
        if ("Dog".equals(animalType)) {
            animal = new Dog();
        } else {
            animal = new Animal();
        }

        // Creating a Rectangle object with constructor overloading
        Rectangle rectangle = new Rectangle(side);

        // Returning sound and area
        return "Animal sound: " + animal.makeSound() + ", Area of square: " + rectangle.area();
    }
}