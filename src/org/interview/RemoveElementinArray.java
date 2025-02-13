package org.interview;

public class RemoveElementinArray {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int elementToRemove = 4;
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == elementToRemove) {
                for (int j = i; j < n - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                n--; // Decrease size after removal
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
