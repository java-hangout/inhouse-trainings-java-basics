package org.jh.iht.java.basics.day02;

// Defining an interface
interface Greetable {
    String greet(String name);
}

// Class implementing the interface
public class InterfacesProgram01 implements Greetable {

    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Static run method to demonstrate the interface usage
    public static String run(String name) {
        Greetable greeter = new InterfacesProgram01(); // Create object of implementing class
        return greeter.greet(name); // Call the method from the interface
    }
}