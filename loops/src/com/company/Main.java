package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int divSum = 0;
        int divAcc = 0;
        for (int i = 0; i < 1000; i++){
            if (isDivisible(i, 3) == true && isDivisible(i, 5) == true) {
                divSum+= i;
                divAcc++;
            }
            if (divAcc == 5 ) break;
        }
        System.out.println("Sum is " + divSum);

        //while loop example

        int count = 0;
        while (count != 6 ){
            System.out.println("Bananas " + count);
            count++;
        }
    }

    public static boolean isDivisible (int num, int divisibleBy) {
        return num % divisibleBy == 0 ? true : false;
    }
}
