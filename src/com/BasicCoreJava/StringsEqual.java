package com.BasicCoreJava;

import java.util.Scanner;

public class StringsEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String s1 = ");
        String s1 = sc.nextLine();
        System.out.println("Enter the String s2 = ");
        String s2 = sc.nextLine();
        if (s1.equals(s2)){
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
