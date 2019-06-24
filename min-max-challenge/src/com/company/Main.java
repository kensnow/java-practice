package com.company;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        boolean first = true;

        while (true){
            System.out.println("Enter a number:");
            boolean isValidInput = scanner.hasNextInt();

            if (isValidInput) {
                int enteredNumber = scanner.nextInt();

                if(first){
                    first = false;
                    min = enteredNumber;
                    max = enteredNumber;
                }

                min = minMaxService(enteredNumber, min, "min");
                max = minMaxService(enteredNumber, max, "max");
            } else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Min number was " + min);
        System.out.println("Max number was " + max);
        scanner.close();
    }

    public static int minMaxService(int enteredNumber, int currentNumber, String serviceType){
        switch (serviceType){
            case "min":
                return enteredNumber < currentNumber ? enteredNumber : currentNumber;
            case "max":
                return enteredNumber > currentNumber ? enteredNumber : currentNumber;
            default:
                return currentNumber;
        }

    }

}
