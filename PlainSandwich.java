package com.company;

public class PlainSandwich implements Sandwich {
    @Override
    public String getDescription() {
        return "Normalt brød ";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
