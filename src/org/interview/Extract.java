package org.interview;

public class Extract {
	
	public static void main(String[] args) {
		
		String s="JavaProject2024";
		
		 // Use a regular expression to replace all non-digit characters with an empty string
        String s1 = s.replaceAll("\\d", "");
        
        System.out.println( s1);
		
		
		
	}

}
