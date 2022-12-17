package com.algorithmproblems;
import java.util.Arrays;
public class InsertionSort {
    static void sort(int array[])
    {
        for(int i=1 ; i<array.length ; i++)
        {
            int key = array[i];
            int j = i-1;

            while((j > -1) && (array[j] > key))
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args)
    {
        int array[] = {12,11,13,5,6};
        System.out.println("Before the Insertion-Sort");
        for(int show:array)
        {
            System.out.print(show +" ");
        }

        sort(array);
        System.out.println();

        System.out.println("After the Insertion-Sort");
        for(int show:array)
        {
            System.out.print(show +" ");
        }
    }
}