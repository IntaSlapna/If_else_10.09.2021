package com.company;

public class Extra6_scores {
    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000)
           return 1;
        else if (score > 500 && score < 1000)
            return 2;
        else if (score > 100 && score < 500)
           return 3;
        else
            return 4;

    }

    public static void main(String[] args) {
        displayHighScorePosition("Sam", calculateHighScorePosition(1500));




    }
}
