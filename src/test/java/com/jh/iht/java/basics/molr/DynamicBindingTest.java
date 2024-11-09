package com.jh.iht.java.basics.molr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Problem Statement: Demonstrate dynamic binding (late binding) in Java.
Create a Interface Shape with a method draw(), and subclasses Circle and Rectangle that override draw().
    - Shape reference pointing to a Circle.
    - Shape reference pointing to a Rectangle.
Expected Output:
    - If the Shape object points to a Circle, the output should be "Drawing a circle".
    - If the Shape object points to a Rectangle, the output should be "Drawing a rectangle".
*/
public class DynamicBindingTest {

    @Test
    public void testDrawCircle() {
        Shape shape = new Circle();  // Shape reference to Circle object
        Assertions.assertEquals("Drawing a circle", shape.draw());  // Expected output: "Drawing a circle"
    }

    @Test
    public void testDrawRectangle() {
        Shape shape = new Rectangle();  // Shape reference to Rectangle object
        Assertions.assertEquals("Drawing a rectangle", shape.draw());  // Expected output: "Drawing a rectangle"
    }
}