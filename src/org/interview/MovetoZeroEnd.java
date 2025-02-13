package org.interview;

import java.util.Arrays;

public class MovetoZeroEnd {
	public static void main(String[] args) {
		      int[] arr = {0, 1, 3, 0, 6, 0, 6, 0};
		        
		  
		        int in = 0;
		        
		       
		        for (int i = 0; i < arr.length; i++) {
		            
		            if (arr[i] != 0) {
		                arr[in++] = arr[i];
		            }
		        }
		        
		        
		        while (in< arr.length) {
		            arr[in++] = 0;
		        }
		        
		        
		        System.out.println ( Arrays.toString(arr));
		    }
		}


