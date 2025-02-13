package org.interview;

public class Vowels {
	 public static void main(String[] args) {
	        String input = "education";
	        String result = "";

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            // Check if the character is a vowel
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
	            	//|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
	            	{
	                result += "#"; // Replace vowel with #
	            } else {
	                result += c; // Keep other characters unchanged
	            }
	        }

	        System.out.println("String after replacing vowels: " + result);
	    }

}
