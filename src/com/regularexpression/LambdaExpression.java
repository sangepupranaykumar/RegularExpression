package com.regularexpression;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.regex.Pattern;
public class LambdaExpression {
    String firstName = "Pranay";
    String lastName = "Kumar";
    String mobileNo = "91-8919494167";
    String eMail = "pranaychinna12@gmail.com";
    String password = "#chinna1156";

    String firstNameRegex = "[A-Za-z]+";
    String lastNameRegex = "[A-Za-z]+";
    String mobileNoRegex = "^(91)[-][0-9]+";
    String eMailRegex = "[a-z]+[@][a-z]+[.][a-z]+";
    String passwordRegex = "[#][a-z0-9]+[$]";

    public void firstName() {
        boolean firstNameResult = Pattern.matches(firstNameRegex, firstName);
        Supplier object = () -> {
            return firstNameRegex;
        };
        System.out.println(object.get());
    }

    public void lastName() {
        boolean lastNameResult = Pattern.matches(lastNameRegex, lastName);
        Supplier object = () -> {
            return lastNameResult;
        };
        System.out.println(object.get());
    }

    public void mobileNumber() {
        boolean mobileNoResult = Pattern.matches(mobileNoRegex, mobileNo);
        Supplier object = () -> {
            return mobileNoResult;
        };
        System.out.println(object.get());

    }

    public void emailID() {
        boolean eMailResult = Pattern.matches(eMailRegex, eMail);
        Supplier object = () -> {
            return eMailResult;
        };
        System.out.println(object.get());


    }

    public void password() {
        boolean passwordResult = Pattern.matches(passwordRegex, password);
        Supplier object = () -> {
            return passwordResult;
        };
        System.out.println(object.get());
    }

    @Override
    public String toString() {
        return "LambdaExpression{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void show()
    {
        System.out.println("\n The Regex Inputs Are : ");
        System.out.println("FIRST NAME REGEX IS : "+firstNameRegex);
        System.out.println("LAST NAME REGEX IS : "+lastNameRegex);
        System.out.println("LAST NAME REGEX IS : "+mobileNoRegex);
        System.out.println("EMAIL-ID REGEX IS : "+eMailRegex);
        System.out.println("PASSWORD REGEX IS : "+passwordRegex);
    }

    public static void main(String[] args) {
        LambdaExpression object1 = new LambdaExpression();
        object1.show();
        System.out.println("\n The result of inputs are : ");
        object1.firstName();
        object1.lastName();
        object1.mobileNumber();
        object1.emailID();
        object1.password();
    }
}