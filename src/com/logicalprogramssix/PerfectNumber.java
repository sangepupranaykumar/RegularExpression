package logicalprogramssix;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        int result=0;
        for(int i=1; i<=number/2; i++)
        {
            if(number % i == 0)
            {
                result = result + i;
            }
        }
        if( result == number)
            System.out.println("Number is Perfect.");
        else
            System.out.println("Number is not Perfect");
    }
}
