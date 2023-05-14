package com.hemant.design_patterns.behavioral.observer.example1;

public class ConcreteObserver implements Observer {
    private final String name;  // Observer name / concrete class name
    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override // Added extra name for identification
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
