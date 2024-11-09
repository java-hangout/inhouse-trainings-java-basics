package com.jh.iht.java.basics.molr;

// Superclass Shape
class Shape {
    public String draw() {
        System.out.println("Drawing a shape");
        return "Drawing a shape";
    }
}

// Subclass Circle that overrides the draw method
class Circle extends Shape {
    @Override
    public String draw() {
        System.out.println("Drawing a circle");
        return "Drawing a circle";
    }
}

// Subclass Rectangle that overrides the draw method
class Rectangle extends Shape {
    @Override
    public String draw() {
        System.out.println("Drawing a rectangle");
        return "Drawing a rectangle";
    }
}