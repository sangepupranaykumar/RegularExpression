package com.regularexpression;
import java.util.regex.Pattern;
public class ClearEmail {
    public void checkEmail(){
    boolean result1 = Pattern.compile("[a-z]*[.][a-z]+[@][a-z]*[.][a-z]*[.][a-z]+").matcher("abc.xyz@bl.co.in").matches();
		if (result1=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result2 = Pattern.compile("[.][a-z]+[@][a-z]*[.][a-z]*[.][a-z]+").matcher(".xyz@bl.co.in").matches();
        if (result2=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }
    boolean result3 = Pattern.compile("[a-z]+[@][a-z]*[.][a-z]*[.][a-z]+").matcher("xyz@bl.co.in").matches();
        if (result3=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result4 = Pattern.compile("[a-z]*[.][a-z]*[.][a-z]+").matcher("bl.co.in").matches();
        if (result4=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result5 = Pattern.compile("[.][a-z]*[.][a-z]+").matcher(".co.in").matches();
        if (result5=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result6 = Pattern.compile("[a-z]*[.][a-z]+").matcher("co.in").matches();
        if (result6=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result7 = Pattern.compile("[.][a-z]+").matcher(".in").matches();
        if (result7=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result8 = Pattern.compile("[a-z]+").matcher("in").matches();
        if (result8=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }

    boolean result9 = Pattern.compile(" ").matcher(" ").matches();
        if (result9=true){
            System.out.println("Matching : ");
        }
        else {
            System.out.println("Not Matching");
        }
}

    public static void main(String[] args) {
        ClearEmail object = new ClearEmail();
        object.checkEmail();
    }
}
