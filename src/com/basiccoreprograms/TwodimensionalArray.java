package com.basiccoreprograms;

import java.util.Scanner;
public class TwodimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Type of Inputs: \n 1:Integer \n 2:Double \n 3:Boolean");
        int choice = sc.nextInt();
        System.out.println("Enter Number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int column = sc.nextInt();


        String[][] numbers = new String[row][column];
        switch (choice) {
            case 1:
                System.out.println("Enter Integer Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Integer array is: \t");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            case 2:
                System.out.println("Enter Double Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Double array is: \t");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            case 3:
                System.out.println("Enter Boolean Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Boolean array is: \t");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            default:
                System.out.println("Invalid Choice: Try Again!!!!");
    }
}}
