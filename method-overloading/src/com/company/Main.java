package com.company;

public class Main {

    private static final String INVALID_VALUE = "invalid value";

    public static void main(String[] args) {

        //Method Overloading Example
        int newScore = calculateScore("Vincent", 500);
        System.out.println("New score is " + newScore);
        int overloadedScore = calculateScore(22);
        System.out.println("Overloaded example: " + overloadedScore);
        calculateScore();
        System.out.println("----challenge----");
        System.out.println(calcFeetAndInchesToCentimeters(500) + " " + calcFeetAndInchesToCentimeters(14,11));
        System.out.println(getDurationString(122, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score){
        System.out.println("Someone scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(){
        System.out.println("No points given, and may god have mercy on your soul");
        return 0;

    }

    //challenge

    public static double calcFeetAndInchesToCentimeters( double feet, double inches){
        if (feet < 0) return -1;
        if (inches < 0 || inches > 12) return -1;

        double totalInches = feet * 12 + inches;
        double inchToCentimeter = 2.54;
        return totalInches * inchToCentimeter;
    }

    public static double calcFeetAndInchesToCentimeters( double inches){
        if (inches < 0 ) return -1;

        double totalFeet = inches / 12;
        double remainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
    }


    //challenge 2 seconds & minutes

    public static String getDurationString(int min, int sec){
        if (min < 0 || sec < 0 || sec > 59) return INVALID_VALUE;
        int hours = min / 60;
        int remainingMins = min % 60;
        return (hours + "h " + remainingMins + "m " + sec + "s");
    }

    public static String getDurationString(int sec){
        if (sec < 0) return INVALID_VALUE;
        int minutes = sec / 60;
        int remainingSecs = sec % 60;
        return getDurationString(minutes, remainingSecs);
    }
}
