package org.interview;

public class CharacterFreqString  {
    public static void main(String[] args) {
        String s = "helloworld"; // Example input string
        int[] count = new int[256]; // Array to store frequency of each character

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            
            count[c]++;
        }

        // Display the frequency of each character
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
}


