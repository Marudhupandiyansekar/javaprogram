package org.interview;

public class StringRevword {
	
	public static void main(String[] args) {
		
		
        String s = "This is my code";
		
		// Split the string by spaces to get the words
		String[] words = s.split(" ");
		
		String res = "";
		
		// Loop through the words array in reverse order
		for (int i = words.length - 1; i >= 0; i--) {
			// Add the word to the result string with a space
			res = res + words[i] + " ";
		}
		
		// Trim the trailing space and print the result
		System.out.println(res.trim());
	}

}
