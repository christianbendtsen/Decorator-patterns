package com.company;

abstract class AddingDecorator implements Sandwich {

    protected Sandwich tempSandwich;

    public AddingDecorator(Sandwich newSandwich){
        tempSandwich = newSandwich;
    }


    public String getDescription() {
        return tempSandwich.getDescription();
    }

    public double getCost(){
        return tempSandwich.getCost();
    }

}
