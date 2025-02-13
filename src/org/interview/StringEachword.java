package org.interview;

public class StringEachword {
	
	public static void main(String[] args) {
		
		 
        String s = "Technical discussion for automation testing with marudhu";
        
        
        String[] words = s.split(" ");
        
        String res = "";
        
        for (String s1 : words) {
            
            String reverse = "";
            
           
            for (int i = s1.length() - 1; i >= 0; i--) {
                
                char c = s1.charAt(i);
                
                reverse = reverse + c;    
            }
            
            res = res + reverse + " ";   
        }
        System.out.println(res);
    }
		
	}


