package com.hashtable;
import java.util.HashMap;
import java.util.Set;
public class WordFrequencyInParagraph {
    static void userInputSentence(String userString)
    {
        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        String[] words = userString.split(" ");
        for (String word : words)
        {
            if (frequency.containsKey(word))
            {
                frequency.put(word, frequency.get(word) + 1);
            }
            else
            {
                frequency.put(word, 1);
            }
        }
        Set<String> stringFrequency = frequency.keySet();
        System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
                + " they are paranoid but because they keep putting themselves deliberately into"
                + " paranoid avoidable situations' is");
        for (String word : stringFrequency)
        {
            if (frequency.get(word) > 1)
                System.out.println(word + " = " + frequency.get(word) + " times.");
        }
    }

    public static void main(String[] args)
    {
        userInputSentence("Paranoids are not paranoid because they are paranoid but because "
                + "they keep putting themselves deliberately into paranoid avoidable situations");
    }
}
