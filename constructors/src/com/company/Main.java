package com.company;

public class Main {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.println(coffeeMaker.getHasCoffeeGrinds());

        System.out.println(coffeeMaker.getHasPotOfCoffee());

        System.out.println(coffeeMaker.makeCoffee());

        coffeeMaker.setCoffee(5);
        coffeeMaker.setWater(8);
        coffeeMaker.toggleIsOn();

        System.out.println(coffeeMaker.getHasCoffeeGrinds());


        System.out.println(coffeeMaker.makeCoffee());
        System.out.println(coffeeMaker.getHasPotOfCoffee());

    }
}
