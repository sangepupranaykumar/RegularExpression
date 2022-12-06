package com.gamblingsimulation;
import java.util.Random;
public class WinOrLoss {
    public static final  int initialStake = 100;
    public static final int stakeBet = 1;
    static Random random = new Random();
    /*
     * Getting the chance of Winning or Loosing game by betting 1$ Using Switch-Case
     */
    public static void main(String[] args)
    {
        int totalStake = initialStake;
        System.out.println("Welcome to Gambling Game Simulator program");
        int play = random.nextInt(2);
        switch(play)
        {
            case 0:
                totalStake = totalStake - stakeBet;
                System.out.println("Stake after losing: "+totalStake);
                break;
            case 1:
                totalStake = totalStake + stakeBet;
                System.out.println("Stake after winning: "+totalStake);
                break;
        }
    }}
