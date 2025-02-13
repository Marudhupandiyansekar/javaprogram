package org.interview;

public class DuplicateArrayRemoveNumbers {
	
	public static void main(String[] args) {
		
		
		
		        int[] n= {1, 2, 3, 4, 5, 2, 6, 4};
		        int num = n.length;

		        //System.out.println("Array after removing duplicates:");
		        for (int i = 0; i < num; i++) {
		            boolean isDuplicate = false;
		            for (int j = 0; j < i; j++) {
		                if (n[i] == n[j]) {
		                    isDuplicate = true;
		                    
		                }
		            }
		            if (!isDuplicate) {
		                System.out.print(n[i] + " ");
		            }
		        }
		    }
		
		
	
//	 int[] array = {10, 20, 10, 30, 20, 40, 50, 40,60};
//     int n = array.length;
//
//     // Remove duplicates
//     int[] uniqueArray = new int[n];
//     int uniqueCount = 0;
//
//     for (int i = 0; i < n; i++) {
//         boolean isDuplicate = false;
//         for (int j = 0; j < uniqueCount; j++) {
//             if (array[i] == uniqueArray[j]) {
//                 isDuplicate = true;
//                 break;
//             }
//         }
//         if (!isDuplicate) {
//             uniqueArray[uniqueCount++] = array[i];
//         }
//     }
//
//     // Print the result
//     System.out.print("Array after removing duplicates: ");
//     for (int i = 0; i < uniqueCount; i++) {
//         System.out.print(uniqueArray[i] + " ");
     }
 


