package com.arrayprograms;

public class SecondLargestElement {
    public static void main(String[] args) {
         int k =2;
        int[] arr = new int[]{8, 5, 6, 3, 7, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k-1){
                System.out.println("Second largest element = "+arr[i]);
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
    }}
