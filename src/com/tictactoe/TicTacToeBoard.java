package com.tictactoe;
public class TicTacToeBoard {
    static char[] cell= new char[10];
    public void initialize() {

        for (int i = 1; i <= 10; i++) {
            cell[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("--TIC--TAC--TOE--");
        System.out.println();
        System.out.println(cell[1]+"|"+cell[2]+"|"+cell[3]);
        System.out.println();
        System.out.println(cell[4]+"|"+cell[5]+"|"+cell[6]);
        System.out.println();
        System.out.println(cell[7]+"|"+cell[8]+"|"+cell[9]);
    }
}
