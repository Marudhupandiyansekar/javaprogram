package org.interview;

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        int elementToInsert = 6;
        int position = 2; // 0-based index

        int[] newArray = new int[numbers.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = elementToInsert;
            } else {
                newArray[i] = numbers[j++];
            }
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
	}
		
		
		
	
        // Original array
//        int[] array = {10, 20, 30, 40, 50};
//        int elementToInsert = 45; // Element to be inserted
//        int position = 4; // Position where the element is to be inserted (0-based index)
//
//        // Create a new array with one extra space
//        int[] newArray = new int[array.length + 1];
//
//        // Copy elements up to the specified position
//        for (int i = 0; i < position; i++) {
//            newArray[i] = array[i];
//        }
//
//        // Insert the new element at the specified position
//        newArray[position] = elementToInsert;
//
//        // Copy the remaining elements after the specified position
//        for (int i = position; i < array.length; i++) {
//            newArray[i + 1] = array[i];
//        }
//
//        // Display the new array
//        System.out.println("Array after insertion: " + Arrays.toString(newArray));
//    }



