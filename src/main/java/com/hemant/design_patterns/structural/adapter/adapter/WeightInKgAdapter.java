package com.hemant.design_patterns.structural.adapter.adapter;

import com.hemant.design_patterns.structural.adapter.adaptee.WeightMachine;

//Implementation of client specific interface
public class WeightInKgAdapter implements WeightInKg {

    WeightMachine weightMachine;

    public WeightInKgAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeight() {
        return weightMachine.getWeightInPounds() * 0.45;
    }
}
