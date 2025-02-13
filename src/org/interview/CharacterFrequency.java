package org.interview;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	 public static void main(String[] args) {
	        String s = "automationtesting";
	      
	       // s = s.replaceAll("\\s", "");
	        
	        HashMap<Character, Integer> Map = new HashMap<>();
	        
	        for (char c : s.toCharArray()) {
	      
	            if (Map.containsKey(c)) {
	                Map.put(c, Map.get(c) + 1);
	            } else {
	              
	                Map.put(c, 1);
	            }
	        }
	        
	        
	        for (Map.Entry<Character, Integer> entry : Map.entrySet()) {
	            System.out.println( entry.getKey() + ": " + entry.getValue());
	        }
	    }
	

}
