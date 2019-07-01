package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Composition is used when a class 'has a' relationship of another class
        // ie. while a Cas class IS a Vehicle
        // a Computer HAS A Motherboard and HAS a Keyboard <- Composition

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case myCase = new Case("2208", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("XYZ1000",27 , "Acer", new Resolution(1900, 1080));
        Motherboard motherboard = new Motherboard("WH5094", "Asus", 4, 4, "v2.33");

        PC myPC = new PC(myCase, monitor, motherboard);

        myPC.powerUp();
    }
}
