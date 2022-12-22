package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SpecialCharacter {
    public void checkSpecialCharacter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password");
        String firstname= scanner.next();
        boolean result = Pattern.compile("(^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*])).{8,}$").matcher(firstname).matches();
        if (result==true){
            System.out.println("It is valid Password");
        }else {
            System.out.println("It is not valid Password");
        }
    }

    public static void main(String[] args) {
        SpecialCharacter object = new SpecialCharacter();
        object.checkSpecialCharacter();
    }
}
