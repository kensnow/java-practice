package com.company;

public class Vehicle {

    private boolean isOn;
    private int engine;
    private int wheels;
    private int fuel;
    private int battery;
    private String color;
    private int speed;



//methods
    public void turnKeys (){
        if (this.isOn == false){
            if (this.fuel > 0 && this.battery > 0) {
                this.isOn = true;
            }

        } else {
            this.isOn = false;
        }
    }

    public void accelerate(int speed){
        this.speed += speed;
    }

    public void decelerate(int speed){
        this.speed -= speed;
    }

    // constructor
    public Vehicle(int engine, int wheels, String color){
        this(false, engine, wheels, 100, 100, color);
    }

    public Vehicle(boolean isOn, int engine, int wheels, int fuel, int battery, String color) {
        this.isOn = isOn;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = fuel;
        this.battery = battery;
        this.color = color;
    }


    //getters setters

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
