package com.hemant.design_patterns.behavioral.observer.example2;

public class HexaObserver implements Observer {

    private final String name;

    public HexaObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int num) {
        System.out.println(name+ " : "+Integer.toHexString(num));
    }
}
