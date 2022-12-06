package com.tictactoe;

import java.util.Scanner;

public class ChooseLetterXorO {
    static char[] cell= new char[10];
    static char player, computer;
    Scanner scanner=new Scanner(System.in);
    public void initializw() {

        for (int i = 1; i <= 10; i++) {
            cell[i] = ' ';
        }
    }
    public void choice(){
        System.out.println("Please select your option: 'X' or 'Y' ");
        char option = scanner.next().charAt(0);
        if (option=='X'){
            player = 'X';
            computer = 'O';
        } else if (option =='Y') {
            player='O';
            computer='X';
        }
    }

    public static void main(String[] args) {
        ChooseLetterXorO object = new ChooseLetterXorO();
        System.out.println("--TIC--TAC--TOE--");
        System.out.println();
        System.out.println(cell[1]+"|"+cell[2]+"|"+cell[3]);
        System.out.println();
        System.out.println(cell[4]+"|"+cell[5]+"|"+cell[6]);
        System.out.println();
        System.out.println(cell[7]+"|"+cell[8]+"|"+cell[9]);
    object.choice();
    }
}
