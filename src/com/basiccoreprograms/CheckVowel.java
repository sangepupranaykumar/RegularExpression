package com.basiccoreprograms;

import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        if( ch == 'a' || ch == 'A')
        {
            System.out.println(ch+" is a Vowel");
        }
        else if(ch == 'e' || ch == 'E')
        {
            System.out.println(ch+" is a Vowel");
        }
        else if(ch == 'i' || ch == 'I')
        {
            System.out.println(ch+" is a Vowel");
        }
        else if(ch == 'o' || ch == 'O')
        {
            System.out.println(ch+" is a Vowel");
        }
        else if(ch == 'u' || ch == 'U')
        {
            System.out.println(ch+" is a Vowel");
        }
        else
            System.out.println(ch+" is a Consonant");

    }
}
