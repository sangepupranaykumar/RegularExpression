package com.basiccoreprograms;
import java.util.Scanner;
import java.util.Random;
public class Flipcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter Number of times want coin to flip: ");
        int totalFlips= sc.nextInt();
        int headFlip=0;
        int tailFlip=0;
        if( totalFlips > 0)
        {
            for(int i=1; i<= totalFlips; i++)
            {
                int flipValue = rd.nextInt(2);
                if(flipValue >0.5)
                {
                    headFlip++;
                }
                else
                {
                    tailFlip++;
                }
            }
        }
        else
        {
            System.out.println("Negative values not allowed. Enter positive value: ");
        }
        float headPercent = (headFlip * 100)/totalFlips;
        float tailPercent = (tailFlip * 100)/totalFlips;
        System.out.println("HeadPercentage: "+headPercent);
        System.out.println("TailPercentage: "+tailPercent);
        System.out.println();

    }
}
