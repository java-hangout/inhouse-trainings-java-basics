package com.jh.iht.java.basics.inheritance;

interface Animal6 {
    String eat();
}

interface Swimmer {
    String swim();
}

class Dolphin implements Animal6, Swimmer {
    public String eat() {
        System.out.println("Dolphin eats");
        return "Dolphin eats";
    }

    public String swim() {
        System.out.println("Dolphin swims");
        return "Dolphin swims";
    }
}

public class JMultipleInheritance {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.eat();  // Outputs: Dolphin eats
        dolphin.swim();  // Outputs: Dolphin swims
    }
}