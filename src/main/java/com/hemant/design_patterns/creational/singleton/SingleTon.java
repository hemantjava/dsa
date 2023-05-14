package com.hemant.design_patterns.creational.singleton;

public class SingleTon {

    private static SingleTon single;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (single == null) {
            single = new SingleTon();
        }
        return single;
    }
}
