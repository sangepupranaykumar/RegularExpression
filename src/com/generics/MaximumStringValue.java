package com.generics;

public class MaximumStringValue {
    public static String maxStringNumber(String num1, String num2, String num3)
    {
        String max = num1;
        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("The max Number Among 3 numbers is: "+maxStringNumber("Peach", "Banana", "Apple"));
    }
}
