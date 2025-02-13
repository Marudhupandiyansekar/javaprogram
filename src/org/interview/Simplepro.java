package org.interview;

public class Simplepro {
	

      public static void main(String[] args) {
    	  int arr[]={1,2,3,4,8,33,8,99,53,9};
          
          int large=Integer.MIN_VALUE,seclarge=Integer.MIN_VALUE;
          
          for(int num:arr){
              
              if (num>large){
                  seclarge=large;
                  large=num;
                  
              }
              else if(num>seclarge && num<large)
              {
              
              seclarge=num;
              }
          }
          System.out.println("Second largest element:" + seclarge);
          
      
  }
}
		
	

