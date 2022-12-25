package com.moodanalyser;
import java.util.Scanner;
public class MoodMessage {
    /**
     * Display Mood
     */
    String message;

    /**
     * create default and parameterized constructors
     */
    public MoodMessage(String message) {
        this.message = message;
    }

    public MoodMessage() {

    }

    public String moodAnalysis() {
        /**
         * In this method return mood
         */
        boolean status = message.toLowerCase().contains("sad");
        if (status == true) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        /**
         * Printing the message through object
         */
        MoodMessage moodAnalyser = new MoodMessage(message);
        String result = moodAnalyser.moodAnalysis();
        System.out.println(result);
    }
}
