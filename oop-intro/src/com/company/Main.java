package com.company;

public class Main {

    public static void main(String[] args) {
	// create object here using Car blueprint / Class

        Car oldGold = new Car();
        Car ford = new Car();

//        ford.model = "Taurus"; //can do this if .model is public, but bad syntax, violates Dependency inversion SOLID rule.
//        oldGold.model = "Highlander";
        ford.setModel("Taurus");
        oldGold.setModel("Highlander");

        System.out.println(oldGold.getModel());
        System.out.println(ford.getModel());
    }
}
