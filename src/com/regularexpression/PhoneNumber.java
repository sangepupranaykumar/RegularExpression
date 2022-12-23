package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    /**
     * Creating the class for user to enter first name
     */
    public void numberFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        String phonenumber= scanner.nextLine();
        boolean result = Pattern.compile("[0-9]{2} [0-9]{10}").matcher(phonenumber).matches();
        if (result==true){
            System.out.println("It is valid Number");
        }else {
            System.out.println("It is not valid Number");
        }
    }

    public static void main(String[] args) {
        PhoneNumber object = new PhoneNumber();
        object.numberFormat();
    }
}
