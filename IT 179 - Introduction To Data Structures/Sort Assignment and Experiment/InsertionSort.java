package edu.ilstu;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10000000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100000000);
		}

		System.out.println("Before:");
		printArray(numbers);

		long startTime = System.currentTimeMillis();
		insertionSort(numbers);
		long endTime = System.currentTimeMillis();

		System.out.println("\nworking....:");
		
		System.out.println("\nAfter:");
		printArray(numbers);
		System.out.println("Took " + (endTime - startTime) + "MS");
	}

	private static void insertionSort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			
			int currentValue = inputArray[i];
			
			int j = i - 1;
			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j];
				j--;
			}
			inputArray[j + 1] = currentValue;
		}
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}