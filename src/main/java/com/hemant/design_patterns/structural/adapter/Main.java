package com.hemant.design_patterns.structural.adapter;

import com.hemant.design_patterns.structural.adapter.adaptee.WeightMachine;
import com.hemant.design_patterns.structural.adapter.adaptee.WeightMachineInPound;
import com.hemant.design_patterns.structural.adapter.adapter.WeightInKg;
import com.hemant.design_patterns.structural.adapter.adapter.WeightInKgAdapter;

public class Main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineInPound();
        weightMachine.setWeightInPounds(5);

        WeightInKg weightInKg = new WeightInKgAdapter(weightMachine);

        System.out.println(weightInKg.getWeight());
    }
}
