package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class WinnerorTie {
    static char[] cell = new char[10];
    static char player, computer;
    public static Scanner scanner = new Scanner(System.in);
    private static int playLocation;

    /*
     * Function for Giving spaces for Cells
     */
    public void initialize()
    {
        for (int i = 1; i < 10; i++)
        {
            cell[i] = ' ';
        }
    }
    /*
     * Function for Displaying the board
     */
    public static void showBoard()
    {
        System.out.println(cell[1] + " | " + cell[2] + " | " + cell[3]);
        System.out.println("---------");
        System.out.println(cell[4] + " | " + cell[5] + " | " + cell[6]);
        System.out.println("---------");
        System.out.println(cell[7] + " | " + cell[8] + " | " + cell[9]);
    }

    /*
     * Players Choice for taking Either X or O
     */
    public void check()
    {
        System.out.println("Please Select Your Choice : 'X' or 'Y' ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X')
        {
            player = 'X';
            computer = 'O';
        }
        else if (choice == 'Y')
        {
            player = 'O';
            computer = 'X';
        }
    }

    /*
     * Selecting Your Needed location
     */
    public static void userMove()
    {
        System.out.println("Enter Location 1-9 to Make Move");
        playLocation = scanner.nextInt();
        if (playLocation < 10 && playLocation > 0)
        {
            cell[playLocation] = player;
            showBoard();
        }
        else
        {
            System.out.println("Invalid Choice");
        }

    }

    public static boolean isEmpty()
    {
        if (cell[playLocation] == ' ')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void checkToss()
    {
        Random random = new Random();
        int tossResult = random.nextInt(2)+1;
        System.out.println("\nChoose 1 for Heads or 2 for Tails");
        int coinSelect = scanner.nextInt();
        if (coinSelect == tossResult)
        {
            System.out.println("\nPlayer Won The Toss! Player Starts");
        }
        else
        {
            System.out.println("\nComputer Won The Toss! Computer Starts");
        }
    }
    /*
     * Selecting Game Tie or Win
     */
    public boolean isGameOver(char[] board, char letter)
    {

        boolean option1 = (board[1] == letter && board[2] == letter && board[3] == letter);
        boolean option2 = (board[4] == letter && board[5] == letter && board[6] == letter);
        boolean option3 = (board[7] == letter && board[8] == letter && board[9] == letter);
        boolean option4 = (board[1] == letter && board[4] == letter && board[7] == letter);
        boolean option5 = (board[2] == letter && board[5] == letter && board[8] == letter);
        boolean option6 = (board[3] == letter && board[6] == letter && board[9] == letter);
        boolean option7 = (board[1] == letter && board[5] == letter && board[9] == letter);
        boolean option8 = (board[3] == letter && board[5] == letter && board[7] == letter);
        if (option1 || option2 || option3 || option4 || option5 || option6 || option7 || option8)
        {

            System.out.println("Player wins!!!");
            return true;
        }
        if (board[1] != ' ' && board[2] != ' ' && board[3] != ' ' && board[4] != ' ' && board[5] != ' '
                && board[6] != ' ' && board[7] != ' ' && board[8] != ' ' && board[9] != ' ')
        {
            System.out.println("Tie!!");
            return true;
        }
        return false;

    }
    public static void main(String[] args)
    {
        WinnerorTie obj = new WinnerorTie();
        System.out.println("Welcome to TIC_TAC_TOE game");
        System.out.println();
        obj.showBoard();
        System.out.println();
        obj.check();
        obj.userMove();
        obj.isEmpty();
        obj.checkToss();

    }
}
