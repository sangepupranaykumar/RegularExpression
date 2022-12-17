package com.algorithmproblems;

public class BubbleSort {
    static void sort(int array[])
    {
        int temp =0;
        for(int i =0 ; i<array.length ; i++)
        {
            for(int  j= 1 ; j < array.length-1 ; j++)
            {
                if(array[j-1] > array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args)
    {
        int array[] = {4,1,6,2,9};
        System.out.println("Before the Bubble-Sort");
        for(int show:array)
        {
            System.out.print(show +" ");
        }
        System.out.println();
        sort(array);
        System.out.println("After the Bubble-Sort");
        for(int show:array)
        {
            System.out.print(show +" ");
        }
    }
}
