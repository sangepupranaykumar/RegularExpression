package com.basiccoreprograms;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = s.nextInt();
        System.out.println("Enter value of y: ");
        int y = s.nextInt();

        double distance = Math.pow((x * x + y * y), 0.5);
        System.out.println("Distance :"+distance);
    }
}
