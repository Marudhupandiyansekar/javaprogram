package org.interview;

public class ExtractNumber {
	
    public static void main(String[] args) {
        String s = "javalearning2024";
        
        StringBuilder s1 = new StringBuilder();

       
        for (int i = 0; i < s.length(); i++) {
        	
            char c= s.charAt(i);

        
            //if (Character.isDigit(c)) 
            	
            	if(Character.isLetter(c))
            
            {
            	
                s1.append(c); 
            }
        }

        String result = s1.toString();
        
        System.out.println("Extracted numbers: " + result);
    }
}

