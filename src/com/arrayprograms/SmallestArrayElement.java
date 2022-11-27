package com.arrayprograms;

public class SmallestArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 6, 3, 1, 9, 2};
        int min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println("Smallest Array Element is "+min);
    }
}
