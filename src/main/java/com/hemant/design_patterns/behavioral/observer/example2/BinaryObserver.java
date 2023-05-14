package com.hemant.design_patterns.behavioral.observer.example2;

public class BinaryObserver implements Observer {

    private final String name;

    public BinaryObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int num) {
        System.out.println(name+ " : "+Integer.toBinaryString(num));
    }
}
