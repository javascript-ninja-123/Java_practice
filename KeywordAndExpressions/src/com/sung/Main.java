package com.sung;

public class Main {

    public static void main(String[] args) {

        int player1 = calculateScore(true,800,5,100);
        int player2 = calculateScore(true,10000,8,200);
        System.out.println(player1);
        System.out.println(player2);


        int highSolution = calculateHighScorePosition(1500);
        displayHighScorePosition("Sung",highSolution );

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){
        if(gameOver){
           int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerOne, int highestPosition){
        System.out.println(playerOne + " manged to get into position " + highestPosition);
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000) return 1;
        else if(score > 500 && score <= 1000) return 2;
        else if(score > 100 && score <= 500) return 3;
        else return 4;
    }

}
