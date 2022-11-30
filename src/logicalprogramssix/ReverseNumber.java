package logicalprogramssix;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        System.out.println("Original Number: "+number);
        int rev=0, rem;
        while(number != 0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10 ;
        }
        System.out.println("Reversed Number: "+rev);
    }
}
