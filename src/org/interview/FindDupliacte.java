package org.interview;

public class FindDupliacte {
	
	public static void main(String[] args) {
		
	    int[] numbers = {1, 2, 3, 4, 5, 2, 6, 4};

        //System.out.println("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate  elements:" + numbers[i]);
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
    }
	}


