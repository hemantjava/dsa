package com.hemant.design_patterns.behavioral.observer.example2;

public interface Subject {

     void attach(Observer observer);

     void detach(Observer observer) ;

     void notifyObservers();

     void setNum(int num);
}
