package com.hemant.design_patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Shape circle = Shape.getShape("circle");
        circle.draw();
        Shape square = Shape.getShape("square");
        square.draw();
    }
}
