package org.interview;

public class RemoveReverse {
	  public static void main(String[] args) {
	        String s = "welcome to infosys";

	       
	        String s1 = s.replaceAll("\\s", "");

	        // Reverse the string
	        String r = new StringBuilder(s1).reverse().toString();

	        System.out.println("Reversed string without spaces: " + r);
	    }
	}


