package com.basiccoreprograms;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if((num1 > num2) && (num1 > num3) )
            System.out.println(num1+ " Number1 is greatest");
        else if(num2 > num3)
            System.out.println(num2+ " Number2 is greatest");
        else
            System.out.println(num3+ " Number3 is greatest");
    }
}
