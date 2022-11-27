package com.arrayprograms;

public class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 5, 9, 7, 6};
        int max = arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest element in array = "+max);
    }
}
