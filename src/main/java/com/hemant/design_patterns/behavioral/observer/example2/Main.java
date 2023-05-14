package com.hemant.design_patterns.behavioral.observer.example2;

public class Main {
    public static void main(String[] args) {
        Observer octa = new OctaObserver("octa");
        Observer hexa = new HexaObserver("hexa");
        Observer binary = new BinaryObserver("binary");
        Subject subject = new SubjectImpl();
        subject.attach(octa);
        subject.attach(hexa);
        subject.attach(binary);
        System.out.println("----------------after all observers-------------");
        subject.setNum(10);
        subject.detach(binary);
        System.out.println("----------------after detach binary observer-------------");
        subject.setNum(32);

    }
}
