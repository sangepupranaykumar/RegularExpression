package com.basiccoreprograms;

import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power: ");
        int num = sc.nextInt();
        if( num>=0 && num<=31)
        {
            /* (Math)inbuilt function to calculate power
             * (int) type of data to be input
             * */
            int power = (int) Math.pow(2, num);
            System.out.println("Power of 2 ^ "+num+" is "+power);

            for(int i=0; i<=num; i++)
            {
                int power2 =(int) Math.pow(2, i);
                System.out.println("Power of 2 ^ "+i+" is "+power2);
            }
        }
        else
        {
            System.out.println("Enter Range less than 32 and try again");
        }
    }
}
