package com.company;

public class Main {

    public static void main(String[] args) {

        //floats, proper convention: enter f after number
        float myFloatValue = 5.25f;
        float myFloatValueAlt = (float) 5.25;
        double myDoubleValue = 5.25d;

        //floats have 7 positions of precision
        //doubles have 16 positions of precision

        System.out.println("floatval: " + myFloatValue);
        System.out.println("doubleval: " + myDoubleValue);

        //doubles are faster on many modern computers.  Use doubles as standard.  More precise.

        double pounds = 1005d;
        double kilograms = pounds * .45359237d;
        System.out.println("kilos:" + kilograms);

        double pi = 3.1415927d;
    }
}
