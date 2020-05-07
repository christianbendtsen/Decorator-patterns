package com.company;

public class Ham extends AddingDecorator {

    public Ham(Sandwich newSandwich) {
        super(newSandwich);

        System.out.println("Tilføj skinke");
    }

    public String getDescription() {
        return tempSandwich.getDescription() + ", skinke";
    }

    public double getCost(){
        return tempSandwich.getCost() + 15;
    }
}
