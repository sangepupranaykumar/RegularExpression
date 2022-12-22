package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EnterLastName {
    public void validLastName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last Name");
        String lastname= scanner.next();
        boolean result = Pattern.compile("0[A-Z]{1}[a-z]{2,}").matcher(lastname).matches();
        if (result==true){
            System.out.println("It is valid last name");
        }
        else {
            System.out.println("It is not a valid last name");
        }
        }

    public static void main(String[] args) {
        EnterLastName object = new EnterLastName();
        object.validLastName();
    }
}
