package org.interview;

public class DuplicateWord {
	
	  public static void main(String[] args) {
	        String s = "Big black bull black big bull his big noise";

	        // Convert to lowercase and split the string into words
	        String[] words = s.toLowerCase().split(" ");

	        //System.out.println("Duplicate words:");

	        // Loop to find duplicates
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals("")) continue;  // Skip if word is already counted

	            int count = 1;
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                    words[j] = "";  // Mark as counted
	                }
	            }

	            // Print word if it has duplicates
	            if (count > 1) {
	                System.out.println(words[i] + " - " + count + " times");
	            }
	        }
	    }
 
		
	
}
