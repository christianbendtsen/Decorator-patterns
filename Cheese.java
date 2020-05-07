package com.company;

public class Cheese extends AddingDecorator {
    public Cheese(Sandwich newSandwich) {
        super(newSandwich);

        //PlainSandwich tilføjer normalt brød
        System.out.println("Tilføj normalt brød ");


        System.out.println("Tilføj ost ");
    }

    public String getDescription() {
        return tempSandwich.getDescription() + "ost";
    }

    public double getCost(){
        return tempSandwich.getCost() + 10;
    }
}
