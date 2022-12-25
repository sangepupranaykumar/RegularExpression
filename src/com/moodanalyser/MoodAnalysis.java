package com.moodanalyser;
import java.util.Scanner;
public class MoodAnalysis {
    /**
     * Display Mood
     */
    String message;

    /**
     * create default and parameterized constructors
     */
    public MoodAnalysis(String message) {
        this.message = message;
    }

    public MoodAnalysis() {

    }

    public void moodAnalysis() throws MoodAnalysisException {
        /**
         * In this method return mood
         */
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException("Enter proper message");
            } else {
                boolean status = message.toLowerCase().contains("sad");
                if (status == true) {
                    System.out.println("Sad");
                } else {
                    System.out.println("Happy");
                }
            }
        } catch (MoodAnalysisException exception) {
            System.out.println("Happy.." + exception);
        }
    }

    public static void main(String[] args) throws MoodAnalysisException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        /**
         * Printing the message through object
         */
        MoodAnalysis moodAnalyser = new MoodAnalysis(message);
        moodAnalyser.moodAnalysis();
    }
}
