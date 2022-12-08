package com.generics;

public class FourParameters<T> {
    T num1, num2, num3, num4;

    public FourParameters(T num1, T num2, T num3, T num4)

    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public static <T extends Comparable<T>> T FourParameters(T num1, T num2, T num3, T num4) {
        T max = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0 && num1.compareTo(num4) > 0  )
            max = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0 && num2.compareTo(num4) > 0)
            max = num2;
        else if (num3.compareTo(num4) > 0)
            max = num3;
        else
            max = num4;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("The max Number Among 4 String numbers is: "+FourParameters("Apple", "Peach", "Banana","DragonFruit"));
        System.out.println("The max Number Among 4 Integer numbers is: "+FourParameters(15,22,27,28));
        System.out.println("The max Number Among 4 Float numbers is: "+FourParameters(32.5f,56.98f,150.281219f,78.99f));
    }
}
