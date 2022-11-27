package com.basiccoreprograms;

import java.util.Scanner;
public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int swap;
        System.out.println("Before Swapping: "+num1+" & "+num2);
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After Swapping: "+num1+" & "+num2);
    }

    }

