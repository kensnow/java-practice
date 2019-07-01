package com.company;

public class Car extends Vehicle {

    private int doors;
    private boolean isAWD;


    public Car(int engine, int wheels, String color, int doors, boolean isAWD) {
        super(engine, wheels, color);
        this.doors = doors;
        this.isAWD = isAWD;
    }

    private void hitTheGas(){
        System.out.println("Vrrrrrroooooom!");
    }

    private void hitTheBreaks(){
        System.out.println("Screeeeeee!");
    }

    @Override
    public void accelerate(int speed){
        hitTheGas();
        super.accelerate(speed);
    }

    @Override
    public void decelerate(int speed){
        hitTheBreaks();
        super.decelerate(speed);
    }

}
