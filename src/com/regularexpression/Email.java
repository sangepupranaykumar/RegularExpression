package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
    public void validMail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Valid Mail");
        String mail = scanner.next();
        boolean result = Pattern.compile("[[a-z]+[.][a-z]]+[@][a-z]+[.][a-z]+[.][a-z]{2,}").matcher(mail).matches();
        if (result==true){
            System.out.println("Mail is Valid mail");
        }
        else{
            System.out.println("It is not valid mail");
        }
    }

    public static void main(String[] args) {
        Email object = new Email();
        object.validMail();
    }
}