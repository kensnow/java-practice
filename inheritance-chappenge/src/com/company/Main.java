package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle myScooter = new Vehicle(5, 2, "Red");

        myScooter.accelerate(10);
        System.out.println(myScooter.getBattery());
        System.out.println(myScooter.getSpeed());

        Car myTesla = new Car (10, 4, "Orange", 4, true);

        myTesla.accelerate(69);
        System.out.println(myTesla.getBattery());
        System.out.println(myTesla.getFuel());
        System.out.println(myTesla.getSpeed());

        Convertible myConvertible = new Convertible(8, "Yellow", 2);

        System.out.println(myConvertible.isTopDown());
        myConvertible.toggleTopDown();
        System.out.println(myConvertible.isTopDown());
    }
}
