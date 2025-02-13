package org.interview;

public class Extractuselogic {
	public static void main(String[] args) {
		
      String s = "java 2024";
        
        
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
          if (c >= '0' && c <= '9') 
            	
            	//if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            
            {
                result += c; 
            }
        }
        
        
        System.out.println(result); 
	}

}
