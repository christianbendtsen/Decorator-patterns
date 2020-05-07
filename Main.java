package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Sandwich basicSandwich =  new Ham(new Cheese(new PlainSandwich()));


        System.out.println("Sandwichen består af: " + basicSandwich.getDescription());
        System.out.println("Prisen er: " + basicSandwich.getCost() + " kr");

    }
}
