package com.jh.iht.java.basics.interfaces;

class Engine {
    public void start() {
        System.out.println("Engine started!");
    }
}

class Car {
    private Engine engine;
    
    public Car() {
        // Car is tightly coupled to Engine
        this.engine = new Engine();  // Car directly depends on Engine class
    }

    public void startCar() {
        engine.start();  // Starts the engine of the car
    }
}

public class TightlyCoupledExample {
    public static void main(String[] args) {
        // Create a Car object which internally creates an Engine object
        Car car = new Car();
        // Call startCar() which should invoke the start() method on the Engine instance
        // We expect the output to be "Engine started!"
        car.startCar();  // Output: Engine started!
    }
}