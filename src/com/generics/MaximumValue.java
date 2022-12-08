package com.generics;

public class MaximumValue <T>{
    T num1, num2, num3;
    public MaximumValue(T num1, T num2, T num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public static <T extends Comparable<T>> T MaximumValue(T num1, T num2, T num3)
    {
        T max = num1;
        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("The max Number Among 3 String numbers is: "+MaximumValue("Apple", "Peach", "Banana"));
        System.out.println("The max Number Among 3 Integer numbers is: "+MaximumValue(15,22,27));
        System.out.println("The max Number Among 3 Float numbers is: "+MaximumValue(32.5f,56.98f,78.99f));
    }
}
