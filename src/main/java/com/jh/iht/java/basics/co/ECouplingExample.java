package com.jh.iht.java.basics.co;

class Engine2 {
    public String start() {
        System.out.println("Engine started");
        return "Engine started";
    }
}

class Car2 {
    private Engine2 engine;

    // Constructor Injection (Loose coupling)
    public Car2(Engine2 engine) {
        this.engine = engine;
    }

    public String startCar() {
        return engine.start(); // Car depends on Engine to start
    }
}

public class ECouplingExample {
    public static void main(String[] args) {
        Engine2 engine = new Engine2();
        Car2 car = new Car2(engine);
        car.startCar(); // Outputs: Engine started
    }
}