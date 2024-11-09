package com.jh.iht.java.basics.oops;

// Encapsulation Example
class Car {
    private String model;
    private int year;
    
    // Encapsulation: Getter and Setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

// Inheritance Example
class ElectricCar extends Car {
    private int batteryCapacity;

    // Method to set battery capacity
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding method from Car class
    @Override
    public void displayCarDetails() {
        super.displayCarDetails();  // Call parent class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Polymorphism Example
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Abstraction Example
abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        // Encapsulation Example
        Car car = new Car();
        car.setModel("Tesla Model X");
        car.setYear(2023);
        car.displayCarDetails();

        // Inheritance and Polymorphism Example
        ElectricCar electricCar = new ElectricCar();
        electricCar.setModel("Tesla Model S");
        electricCar.setYear(2023);
        electricCar.setBatteryCapacity(100);
        electricCar.displayCarDetails();

        // Polymorphism Example
        Animal animal = new Animal();
        animal.sound(); // Animal makes a sound

        Animal dog = new Dog();
        dog.sound(); // Dog barks

        Animal cat = new Cat();
        cat.sound(); // Cat meows

        // Abstraction Example
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}