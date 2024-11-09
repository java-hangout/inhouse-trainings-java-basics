package com.jh.iht.java.basics.inheritance;

final class FinalClass {
    public String speak() {
        System.out.println("Final class method");
        return "Final class method";
    }
}

class AnotherClass {
    // This will cause an error:
    // class SubClass extends FinalClass {}
}

public class HFinalClassesAndMethods {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.speak();  // Outputs: Final class method
    }
}