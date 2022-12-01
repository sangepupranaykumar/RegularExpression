package com.SnakeandLadder;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to the Snake and Ladder ");
        int userPosition = 0;
        System.out.println();
        System.out.println("Initial Position of the Player "+userPosition);
      int dice = random.nextInt(6)+1;
      System.out.println(dice);
    }
}
