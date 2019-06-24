package com.company;

public class Main {

    public static void main(String[] args) {
	//Operators
    // assignment '=' operator, assigns the values on the right, to the variable on left
        int result = 1 + 64;
        System.out.println("result: " + result);

        int prevResult = result;

        //math operators '+,-,/,*,%
        result = result + 1;
        System.out.println("newresult +: " + result);
        result = result - 1;
        System.out.println("newresult - : " + result);
        result = result * 1;
        System.out.println("newresult *: " + result);
        result = result / 1;
        System.out.println("newresult /: " + result);
        result = result % 3;
        System.out.println("newresult %: " + result);

        // shorthand ++, --, +=, *=, -=, /=

        result++;
        System.out.println("newresult ++: " + result);
        result--;
        System.out.println("newresult -- : " + result);
        result*= 10;
        System.out.println("newresult *=: " + result);
        result/= 10;
        System.out.println("newresult /=: " + result);

        boolean isBlue = false;

        //conditionals

        if (isBlue == false)
            System.out.println("its not blue");

        if (isBlue == true)
            System.out.println("its not blue");

        int topScore = 20;
        if (topScore == 100)
            System.out.println("you win!");

        if (topScore < 100)
            System.out.println("You lose");

        int secondScore = 70;

        //multiple conditons
        if (topScore > secondScore && topScore < 100)
            System.out.println("Both true!");
        // optionally add parens
        //or operator
        if (topScore > 90 || secondScore <= 90)
            System.out.println("Or true!");

        boolean isTest = true;

        //mistakenly use assignment instead of == comparison
        //bad code
        //        if(isTest = true) //single '=' is bad
        //            System.out.println("This should not be true");

        //ternary operator
        String ternaryTest = isTest ? "Bananas" : "Snails";
        System.out.println(ternaryTest);
        // BEING challenge --------------------------------------->

        System.out.println("Begin challenge");
        double firstNum = 20d;
        double secNum = 80d;
        double addSum = (firstNum + secNum) * 25;
        double modResult = addSum % 40;

        if (modResult <= 20)
            System.out.println("Total was over limit");
    }
}
