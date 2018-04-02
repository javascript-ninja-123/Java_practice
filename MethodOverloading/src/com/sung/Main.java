package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = calculateScore("Sung", 500);
        System.out.println(result);

        int result2 = calculateScore(600);
        System.out.println(result2);

        int result3 = calculateScore();
        System.out.println(result3);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player " + "scored " + score);
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
}
