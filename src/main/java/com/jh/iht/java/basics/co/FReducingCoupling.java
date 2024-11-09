package com.jh.iht.java.basics.co;

// Interface for Engine
interface Engine3 {
    String start();
}

// Concrete class for Electric Engine
class ElectricEngine3 implements Engine3 {
    @Override
    public String start() {
        System.out.println("Electric Engine3 started.");
        return "Electric Engine3 started.";
    }
}

// Concrete class for Gas Engine
class GasEngine3 implements Engine3 {
    @Override
    public String start() {
        System.out.println("Gas Engine3 started.");
        return "Gas Engine3 started.";
    }
}

// Car class that uses Engine interface to reduce coupling
class Car3 {
    private final Engine3 engine1;  // Loose coupling: Car doesn't depend on a specific Engine type

    // Constructor injection to set the engine
    public Car3(Engine3 engine1) {
        this.engine1 = engine1;
    }

    public String startCar() {
        return engine1.start();
    }
}

public class FReducingCoupling {
    public static void main(String[] args) {
        // We can easily switch engine types
        Engine3 electricEngine1 = new ElectricEngine3();
        Car3 electricCar1 = new Car3(electricEngine1);
        electricCar1.startCar();  // Outputs: Electric Engine started.

        Engine3 gasEngine1 = new GasEngine3();
        Car3 gasCar1 = new Car3(gasEngine1);
        gasCar1.startCar();  // Outputs: Gas Engine started.
    }
}