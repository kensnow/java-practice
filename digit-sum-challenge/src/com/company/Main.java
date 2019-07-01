package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(1237321));
    }
    public static boolean isPalindrome (int number){
        if (number <= 9 && number > 0) return true;


        int endNum = number % 10;
        int firstNum = getFirstNum (number);
        if (endNum != firstNum) return false;

        int significantDigits = getSignificantDigits(number);

        if (significantDigits < 2) {
            return true;
        } else {
            int dropLeadNum = number % (int) Math.pow(10, significantDigits - 1);
            int dropLastNum = (dropLeadNum - dropLeadNum % 10) / 10;
            return isPalindrome(dropLastNum);
        }

    }

    public static int getFirstNum (int number){
        while (number > 9){
            number = (number - number % 10) / 10;
        }
        return number;

    }

    public static int getSignificantDigits(int number){
        int counter = 1;
        while (number > 9){
            counter ++;
            number = (number - number % 10) / 10;
        }
        return counter;
    }

}
