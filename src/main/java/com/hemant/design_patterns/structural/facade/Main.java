package com.hemant.design_patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie();
        System.out.println("==============================================================");
        facade.turnOff();
    }
}
