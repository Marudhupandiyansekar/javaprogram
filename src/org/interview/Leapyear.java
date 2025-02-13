package org.interview;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String[] args){
	      int year=2012;
	      
	      //System.out.println("Enter an Year :: ");
	      
	      //Scanner s= new Scanner(System.in);
	      
	      //year = s.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	    	  
	         System.out.println(" leap year");
	      
	      else
	    	  
	         System.out.println(" not a leap year");
	   }

}
