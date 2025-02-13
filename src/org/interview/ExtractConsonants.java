package org.interview;

public class ExtractConsonants {
	
	    public static void main(String[] args) {
	        String input = "automation2024";
	        String consonants = "";

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	                  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ) {
	                consonants += c; // Add consonant to the result
	            }
	        }

	        System.out.println("Consonants in the string: " + consonants);
	    }

}
