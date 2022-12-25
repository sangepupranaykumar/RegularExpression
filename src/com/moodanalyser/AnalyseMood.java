package com.moodanalyser;
import java.util.Scanner;
public class AnalyseMood {
    /**
     * Display Mood
     */
    public String moodAnalysis(String message) {
        /**
         * Return mood in this method
         */
        boolean status = message.toLowerCase().contains("sad");
        if (status == true) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = scanner.nextLine();
        AnalyseMood moodAnalyser = new AnalyseMood();
        String result = moodAnalyser.moodAnalysis(message);
        System.out.println(result);
    }
}
