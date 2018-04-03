package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EnhancedPlayer player1 = new EnhancedPlayer("Sung", 200);
        player1.attack(20);
        System.out.println("Player1's helath is " + player1.getHealth());


    }
}
