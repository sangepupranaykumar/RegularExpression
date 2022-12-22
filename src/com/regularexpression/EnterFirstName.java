package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EnterFirstName {
    /**
     * Creating the class for user to enter first name
     */
    public void validFirstName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstname= scanner.next();
        boolean result = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstname).matches();
        if (result==true){
            System.out.println("It is valid first name");
        }else {
            System.out.println("It is not valid first name");
        }
    }

    public static void main(String[] args) {
        EnterFirstName object = new EnterFirstName();
        object.validFirstName();
    }
}
