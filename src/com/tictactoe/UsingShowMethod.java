package com.tictactoe;
import java.util.Scanner;
public class UsingShowMethod {
    static char[] cell = new char[10];
    static char player, computer;
    Scanner scanner = new Scanner(System.in);

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
    public void showBoard()
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
    public static void main(String[] args)
    {
        DisplayBoard obj = new DisplayBoard();
        System.out.println("Welcome to TIC_TAC_TOE game");
        System.out.println();
        obj.showBoard();
        System.out.println();
        obj.check();
    }
}
