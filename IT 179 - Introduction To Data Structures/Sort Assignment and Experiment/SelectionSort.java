/*
 * Created on: Apr 27, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.Arrays;
import java.util.Random;

/**
 * <insert class description here>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class SelectionSort
{
	public static void main(String[] args)
	{
		int [] numbers = new int[10000000];
		Random random = new Random();
		
		for (int i = 0; i<numbers.length; i++)
		{
			numbers[i] = random.nextInt(100000);
		}
		
		System.out.println("Before:");
		printArray(numbers);
		
		long startTime = System.currentTimeMillis();
		selectionSort(numbers);
		long endTime = System.currentTimeMillis();
		
		System.out.println("\nAfter:");
		printArray(numbers);
		System.out.println("Took " + (endTime - startTime) + "MS");
	}

	/**
	 * @param numbers
	 */
	private static void selectionSort(int[] numbers)
	{
		int length = numbers.length;
		
		for (int i = 0; i < length-1; i++)
		{
			int min = numbers[i];
			int indexOfMin = i;
			for (int j = i + 1; j < length; j++)
			{
				if (numbers[j] < min)
				{
					min = numbers[j];
					indexOfMin = j;
				}
			}
			swap(numbers, i , indexOfMin);
		}
	}

	/**
	 * @param numbers
	 * @param i
	 * @param indexOfMin
	 */
	private static void swap(int[] numbers, int a, int b)
	{
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
