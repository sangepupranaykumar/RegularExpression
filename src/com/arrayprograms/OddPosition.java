package com.arrayprograms;

public class OddPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 6, 3, 1, 9, 2};
        for (int i =0; i< arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
