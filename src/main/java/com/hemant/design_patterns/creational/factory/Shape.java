package com.hemant.design_patterns.creational.factory;

//Factory design pattern is creational In Java,
// the Factory Pattern is commonly implemented using a static factory method in the superclass

//Shape interface with one abstract draw and one static factory method getShape
public interface Shape {

    void draw();
    static Shape getShape(String type) {

        if (type.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (type.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;
    }
}
