package org.interview;

public class Duplicate {
	   public static void main(String[] args) {
	        String s = "programming";
	        int[] count = new int[256];  // Array to store frequency of each character

	        // Convert the string to lowercase (optional, depending on case sensitivity)
	        //s = s.toLowerCase();

	        // Count frequency of each character
	        for (int i = 0; i < s.length(); i++) {
	          char ch= s.charAt(i);
	          
	          count[ch]++;
	        }

	        // Print characters that appear more than once
	        //System.out.println("Duplicate characters:");
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > 1) {
	                System.out.println((char) i + " - " + count[i] + " times");
	            }
	        }
	    }

}
