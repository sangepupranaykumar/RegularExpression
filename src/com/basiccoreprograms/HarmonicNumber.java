package com.basiccoreprograms;

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find its Harmonic value: ");
        int number = sc.nextInt();
        double harmonic = 0;
        for (double i = 1; i < number; i++) {
            harmonic = harmonic + (1 / i);
        }
        System.out.println("Harmonic value: " + harmonic);

    }
}
