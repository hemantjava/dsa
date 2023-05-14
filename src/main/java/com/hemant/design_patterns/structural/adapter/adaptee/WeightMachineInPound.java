package com.hemant.design_patterns.structural.adapter.adaptee;

public class WeightMachineInPound implements WeightMachine {

    private double pounds;

    @Override
    public double getWeightInPounds() {
        return pounds;
    }

    @Override
    public void setWeightInPounds(double pounds) {
        this.pounds = pounds;
    }
}
