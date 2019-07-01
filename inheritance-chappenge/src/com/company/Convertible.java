package com.company;

public class Convertible extends Car {

    private boolean isTopDown;

    public Convertible(int engine, String color, int doors) {
        super(engine, 4, color, doors, false);
        this.isTopDown = false;
    }

    public void toggleTopDown(){
        this.isTopDown = !this.isTopDown;
    }

    public boolean isTopDown() {
        return isTopDown;
    }

    public void setTopDown(boolean topDown) {
        isTopDown = topDown;
    }
}
