package com.hemant.design_patterns.behavioral.observer.example1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setMessage("Hello World!"); // notify all attached observers

        subject.detach(observer2);// detached 2nd observer from observers list
        System.out.println("=======================================");

        subject.setMessage("Goodbye World!");
    }
}