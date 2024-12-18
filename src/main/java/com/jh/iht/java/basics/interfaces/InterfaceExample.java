package com.jh.iht.java.basics.interfaces;

// Step 1: Create the Engine interface
interface Engine1 {
    String start();
}

// Step 2: Implement the Engine interface with the GasEngine class
class GasEngine implements Engine1 {
    public String start() {
        System.out.println("Gas Engine started!");
        return "Gas Engine started!";
    }
}

// Step 3: Implement the Engine interface with the ElectricEngine class
class ElectricEngine implements Engine1 {
    public String start() {
        System.out.println("Electric Engine started!");
        return "Electric Engine started!";
    }
}

// Step 4: Car class uses Engine interface, making it loosely-coupled
class Car1 {
    private Engine1 engine;
    
    public Car1(Engine1 engine) {
        this.engine = engine;  // Now Car is not tightly-coupled to a specific Engine class
    }

    public String startCar() {
        return engine.start();  // Starts the engine of the car, works for any engine type
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create a Car with a GasEngine
        Car1 gasCar = new Car1(new GasEngine());
        gasCar.startCar();  // Output: Gas Engine started!
        
        // Create a Car with an ElectricEngine
        Car1 electricCar = new Car1(new ElectricEngine());
        electricCar.startCar();  // Output: Electric Engine started!
    }
}