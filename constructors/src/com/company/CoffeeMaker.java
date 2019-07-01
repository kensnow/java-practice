package com.company;

public class CoffeeMaker {

    private boolean isOn;
    private boolean hasWater;
    private boolean hasCoffeeGrinds;
    private boolean hasPotOfCoffee;
    private int water;
    private int coffee;

    public boolean getIsOn(){
        return this.isOn;
    }

    public boolean getHasWater(){
        return this.hasWater;
    }

    public boolean getHasCoffeeGrinds(){
        return  this.hasCoffeeGrinds;
    }

    public boolean getHasPotOfCoffee() {
        return this.hasPotOfCoffee;
    }

    public void toggleIsOn(){
        this.isOn = !this.isOn;
    }

    public void setWater(int water){
        this.water = water;
        if (this.water > 4) {
            this.hasWater = true;
        }
    }

    public void setCoffee (int coffee){
        this.coffee = coffee;
        if (this.coffee > 0) this.hasCoffeeGrinds = true;
    }

    public String makeCoffee (){
        if (isOn && hasWater && hasCoffeeGrinds){
            this.hasPotOfCoffee = true;
            return "Coffe is ready!";
        } else {
            return "Coffee Maker is not yet ready!";
        }
    }


}
