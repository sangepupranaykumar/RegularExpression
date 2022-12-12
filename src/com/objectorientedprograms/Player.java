package com.objectorientedprograms;
import java.util.Scanner;
public class Player {
    public static void main(String[] args) {
        System.out.println("\nPress 1 ->> To view cards of 4 Players");
        DeckOfCards cards = new DeckOfCards();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                cards.getCardCombination();
                cards.getPlayer();
                break;
            default:
                System.out.println("!!invalid input!!");
                break;
        }
    }
}