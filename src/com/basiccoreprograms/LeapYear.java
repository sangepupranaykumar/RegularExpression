package com.basiccoreprograms;

import java.util.Scanner;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = scan.nextInt();

        if( year%4==0 && year%100!=0 || year%400==0)
            System.out.println("The Year is a Leap Year");
        else
            System.out.println("The Year is NOT a Leap Year");
    }
    }

