package org.interview;

public class ExtractVowels {
    public static void main(String[] args) {
        String input = "Marudhu";
        String vowels = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels += c; // Add vowel to the result
            }
        }

        System.out.println("Vowels in the string: " + vowels);
    }

}


