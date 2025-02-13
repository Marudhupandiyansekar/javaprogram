package org.interview;

public class RemoveCharacter {
	

	    public static void main(String[] args) {
	        String input = "welcome";
	        char c = 'w';
	        String result = "";

	        // Loop through each character in the string
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) != c) {
	                result += input.charAt(i); // Append the character if it is not the one to remove
	            }
	        }

	        System.out.println("String after removing '" + c  + "': " + result);
	    }
	}

