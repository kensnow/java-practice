package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        int finalScore = returnCalculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        displayHighScorePosition("bob", calculateHighScorePosition(502));
    }

    //if creating a method which does not return any value, use 'void' in method name
    //if creating a not-pure method, which only has side effects, use 'void'

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            //finalScore is scoped to this code black.
            System.out.println("Final Score: " + finalScore);
        }
    }

    public static int returnCalculatedScore(boolean gameOver, int score, int levelCompleted, int bonus){
        //must return something EVERY time the method is called
        //if 'gameOver' were true, need to add a return -1 statement to capture the else condition.
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            //finalScore is scoped to this code black.
            return finalScore;
        }
        return -1;

    }

    //challenge methods

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " is ranked #" + position);
    }
//
//    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore > 1000){
//            return 1;
//        } else if (playerScore > 500 && playerScore <= 1000){
//            return 2;
//        } else if (playerScore > 100 && playerScore <= 500){
//            return 3;
//        } else {
//            return 4;
//        }
//    }
    //refactored
//    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore > 1000){
//            return 1;
//        } else if (playerScore > 500){
//            return 2;
//        } else if (playerScore > 100){
//            return 3;
//        } else {
//            return 4;
//        }
//    }

    //refactored again
    // single return statements are considered better and easier to follow.
    public static int calculateHighScorePosition(int playerScore){
        int position = 4; //position 4 is default return

        if (playerScore > 1000){
            position = 1;
        } else if (playerScore > 500){
            position = 2;
        } else if (playerScore > 100){
            position = 3;
        }
        return position;
    }



}
