package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double avg = 0;
        int sum = 0;


        while(true){
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int userInput = scanner.nextInt();
                counter ++;
                sum += userInput;
                avg = sum / counter;
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
