package org.interview;

public class RemoveDuplicatearray {
	
	    public static void main(String[] args) {
	        String[] array = {"apple", "banana", "apple", "orange", "banana", "grape"};
	        //System.out.println("Original array:");
	        for (String s : array) System.out.print(s + " ");
	        System.out.println("\nArray after removing duplicates:");

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == null) continue;
	            System.out.print(array[i] + " ");
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i].equals(array[j])) array[j] = null; // Mark duplicate as null
	            }
	        }
	    }
	}


