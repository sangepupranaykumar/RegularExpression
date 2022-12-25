package com.moodanalyser;
import java.util.Scanner;
public class UserInvalidMood {
    /**
     * Display Mood
     */
    String message;

    /**
     * create default and parameterized constructors
     */
    public UserInvalidMood(String message) {
        if (message.equalsIgnoreCase("null")) {
            this.message = null;
        } else {
            this.message = message;
        }
    }

    public UserInvalidMood() {

    }

    public void moodAnalysis() {
        /**
         * In this method return mood
         */
        try {
            boolean status = message.toLowerCase().contains("sad");
            if (status == true) {
                System.out.println("Sad");
            } else {
                System.out.println("Happy");
            }
        } catch (Exception exception) {
            System.out.println("Happy");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        /**
         * Printing the message through object
         */
        UserInvalidMood moodAnalyser = new UserInvalidMood(message);
        moodAnalyser.moodAnalysis();
    }
}
