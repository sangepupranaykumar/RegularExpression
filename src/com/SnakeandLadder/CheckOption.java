package com.SnakeandLadder;

import java.util.Random;

public class CheckOption {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to the Snake and Ladder ");
        int userPosition = 0;
        System.out.println();
        System.out.println("Initial Position of the Player "+userPosition);
        int dice = random.nextInt(6)+1;
        System.out.println(dice);

        int option = random.nextInt(3);
        switch (option)
        {
            case 0 : System.out.println("No play");
                break;
            case 1 : System.out.println("Ladder");
                userPosition = userPosition + dice;
                System.out.println("Now the user position is = "+userPosition);
                break;
            case 2 : System.out.println("Snake");
                userPosition = userPosition - dice;
                if (userPosition<0){
                    userPosition = 0;
                }
        }
        System.out.println("Position of the user "+userPosition);
    }
}
