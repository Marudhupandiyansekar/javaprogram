package org.interview;

public class ReplaceVowels {
	
	   public static void main(String[] args) {
	        String input = "marudhu";
	        String result = "";
	        String vowels = "aeiouAEIOU";
	        int count = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
	                count++;
	                result += "*".repeat(count); // Add '*' based on the count
	            } else {
	                result += ch; // Keep the consonants as is
	            }
	        }

	        System.out.println("Transformed string: " + result);
	    }

}
