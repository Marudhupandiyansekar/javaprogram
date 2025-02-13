package org.interview;

public class Integeroccurences {
	
	 public static void main(String[] args) {
	        int arr[] = {1, 2, 4, 43, 2, 5, 2, 3,152};

	        for (int i = 0; i < arr.length; i++) {
	        	
	            int count = 1;
	            
	            for (int j = i + 1; j < arr.length; j++) {
	            	
	                if (arr[i] == arr[j]) {
	                    count++;
	                    
	                    arr[j] = -1; // Mark duplicate elements as -1
	                }
	            }
	            if (arr[i] != -1) {
	                System.out.println(arr[i] + " :" + count + " time");
	            }
	        }
	    }
	}


