package com.arrayprograms;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 6, 3, 1, 9, 2};
        for (int i = 1; i< arr.length; i=i+2){
            System.out.println("Even Position elements "+arr[i]);
        }
    }
}
