package com.company;

public class PC {
    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(30, 40, "green");
    }
}
