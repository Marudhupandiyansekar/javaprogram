package org.interview;

public class Secondlargestarray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,5,8,9,4,6,5,9};
		
		int large= Integer.MIN_VALUE, seclarge=Integer.MIN_VALUE;
		
		//int large= Integer.MAX_VALUE, seclarge=Integer.MAX_VALUE;
		
		for (int num : arr) {
			
			if(num>large)
				
				//if(num<large)
			{
				
				seclarge=large;
				large=num;
				
			}
			
			else if (num>seclarge&&num<large) 
				//else if (num<seclarge&&num>large)
				{
					seclarge=num;
				
			}
			
		}
		
		System.out.println(seclarge);
		
	}
}
