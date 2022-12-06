package com.tictactoe;
import java.util.Scanner;
public class CheckingFreeSpace {
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

    public static void main(String[] args)
    {
        CheckingFreeSpace obj = new CheckingFreeSpace();
        System.out.println("Welcome to TIC_TAC_TOE game");
        System.out.println();
        obj.showBoard();
        System.out.println();
        obj.check();
        obj.userMove();
        obj.isEmpty();
    }
}
