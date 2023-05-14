package com.hemant.design_patterns.structural.facade;

public class CableBox {
public void turnOn() {
        System.out.println("Turning on the cable box");
        }

public void turnOff() {
        System.out.println("Turning off the cable box");
        }

public void changeChannel(int channel) {
        System.out.println("Changing the cable box channel to " + channel);
        }
        }