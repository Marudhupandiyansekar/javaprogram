package org.interview;

public class SwapNumbers {
	public static void main(String[] args) {
		
	    int a = 120;  // Initialize the value of a
        int b = 185;  // Initialize the value of b

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic without using a third variable
        a = a + b;  // Step 1: a becomes the sum of a and b
        b = a - b;  // Step 2: b becomes the original value of a
        a = a - b;  // Step 3: a becomes the original value of b

        System.out.println(" a = " + a + ", b = " + b);
    }

		
	}


