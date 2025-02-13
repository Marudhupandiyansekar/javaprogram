package org.interview;

public class Marudhu {
	
		
		public static void main(String[] args) {
			
			// Input string
			String s = "this is my code"; 
			
			// Split the string by spaces to get individual words
			String[] words = s.split(" ");
			
			// Initialize the result string
			String res = "";
			
			// Loop through the words array in reverse order
			for (int i = words.length - 1; i >= 0; i--) {
				
				// Append each word to the result string
				res = res + words[i] + " ";
			}
			
			// Print the final reversed string and trim any trailing spaces
			System.out.println(res);
		}
	}



