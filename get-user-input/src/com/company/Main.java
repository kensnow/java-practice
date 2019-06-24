
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            //after getting a number input, must be a nextLine() method ot solve enter bug.
            //to handle enter key bug add a nextline after nextInt enter bug
            Scanner scanner = new Scanner(System.in);
            System.out.println();

            boolean hasNextInt = scanner.hasNextInt(); //returns true if user enters an int

            if (hasNextInt) {
                int yearOfBirth = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter your name: ");
                String name = scanner.nextLine(); //prompt for a single line of text, save to name
                System.out.println("Hello! " + name + " Born in " + yearOfBirth);
//                scanner.close();
            } else {
                System.out.println("Yall fucked up");
            }

            //challenge zone
            int challengeSum = 0;
//            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 6; i++){

                System.out.println("Enter number " + i);
                boolean getNextInt = scanner.hasNextInt(); //returns true if user enters an int
                int input = scanner.nextInt();
                scanner.nextLine();
                challengeSum += input;
            }

            scanner.close();
            System.out.println("Sum is: " + challengeSum);

    }
}
