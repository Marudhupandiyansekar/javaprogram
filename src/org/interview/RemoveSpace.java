package org.interview;

public class RemoveSpace {

	public static void main(String[] args) {
		
		   String s = "Technical discussion with marudhu";
	        StringBuilder sb = new StringBuilder();
	        
	        // Traverse each character of the string
	        for (int i = 0; i < s.length(); i++) {
	            // If the current character is not a space, append it to output
	            if (s.charAt(i) != ' ') {
	                sb.append(s.charAt(i));
	            }
	        }
	        
	        // Convert StringBuilder to String and print
	        System.out.println(sb.toString());
	    }
	
		
	}

