package org.interview;


public class Largestelementinarray {
	
	 public static void main(String[] args) {
	        
	        int arr[] = {5, 3, 7, 5, 1, 4, 9, 8}; 
	        
	        int max = arr[0]; 
	        
	        for (int i = 0; i < arr.length; i++) {  
	            if (arr[i] > max) {  
	                max = arr[i]; 
	            }
	        }
	        
	        System.out.println( max); 
	    }
	}