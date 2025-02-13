package org.interview;

import java.util.Scanner;

public class FactorialNumber {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        
	        int number = scanner.nextInt();

	        if (number < 0) {
	        	
	            System.out.println("Factorial is not defined for negative integers.");
	            
	        } else {
	        	
	            int factorial = 1;
	            
	            for (int i = 1; i <= number; i++) {
	            	
	                factorial *= i;
	            }
	            System.out.println("The factorial of " + number + " is " + factorial);
	        }
	        scanner.close();
	    }
	

}
