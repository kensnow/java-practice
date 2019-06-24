package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printDayOfTheWeek(4);
//        printDayOfTheWeek(3);
//        printDayOfTheWeek(543);

        for (int i = 0; i < 7; i++){
            printDayOfTheWeek(i);
        }

        // find primes challenge
        int primeCount = 0;
        for (int i = 2; i < 1000; i++){
            if (isPrime(i) == true){
                System.out.println( i + " is prime");
                primeCount++;
            }
            if (primeCount >= 3) break;
        }
        System.out.println("Found " + primeCount + " prime numbers");

        char test = 'B';
        switch(test){
            case 'A':
                System.out.println("Yall chose a");
                break;
            case 'B':
                System.out.println("B tobe");
                break;
            case 'C':
                System.out.println("C by the sea");
                break;
            default:
                System.out.println("Balogna");


        }
    }

    public static boolean isPrime(int n){

        if (n == 1) return false;

        for (int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printDayOfTheWeek (int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
