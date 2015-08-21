package com.andy;

public class Main {

    public static void main(String[] args) {
	    calculateScore("Tim", 500);
        calculateScore(1000);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score was " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return -1;
    }
}


