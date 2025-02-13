package org.interview;

public class VowelsCount {
	public static void main(String[] args) {
		
		String s="education";
		
		int vowelscount=0; //, consonantscount=0;
		
		String vowels="";  //,consonants="";
		
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				
				vowelscount ++;
				
				vowels = vowels+c;
				
				
			}
			
			else {
				//consonantscount ++;
				
				//consonants=consonants+c;
				
			}
			
		}
		
		System.out.println("Number of vowels: " + vowelscount);
        System.out.println("Vowels: " + vowels);
        //System.out.println("Number of consonants: " + consonantscount);
      //  System.out.println("Consonants: " + consonants);
		
		
	}

}
