package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Program that works with arrays of integers including sorting and merging
 * sorted arrays
 * 
 * @author Mary Elaine Califf and Adiboshi Shalom
 *
 */
public class ArraySorting
{
	// This method reads the contents of the specified file into theArray and
	// returns the number
	// of elements read
	public static int readArray(int[] theArray, String inputFileName)
	{
		int count = 0;
		try
		{
			Scanner scan = new Scanner(new File(inputFileName));

			for (int i = 0; i < theArray.length; i++)
			{
				if (scan.hasNextInt())
				{
					theArray[i] = scan.nextInt();
					scan.nextLine();
					count++;
				}

			}
			scan.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found exception " + e.getMessage());
		} catch (NoSuchElementException e)
		{
			System.out.println("No such element exception " + e.getMessage());
		}

		return count;
	}

	// This method writes the first numValues elements of theArray to the specified
	// file
	public static void writeArray(int[] theArray, int numValues, String outputFileName)
	{
		try
		{
			PrintWriter file = new PrintWriter(new FileWriter(outputFileName, false));
			for (int i = 0; i < numValues; i++)
			{
				file.println(theArray[i]);
			}
			file.close();
		} catch (IOException e)
		{
			System.out.println("There is an IO exception" + e.getMessage());
		}
	}

	// This method sorts the first numValue elements of theArray using the selection
	// sort
	// algorithm
	public static void selectionSort(int[] theArray, int numValues)
	{
		int temp;
		int size = numValues;
		int index = 0;

		for (int i = numValues - 1; i > 0; i--)
		{
			index = 0;
			for (int j = 1; j <= i; j++)
			{
				if (theArray[j] > theArray[index])
				{
					index = j;
				}
			}
			temp = theArray[i];
			theArray[i] = theArray[index];
			theArray[index] = temp;
			size--;
		}
	}

	// This method puts the contents of arr1 and arr2 into the array mergedArr so
	// that mergedArr is sorted. It then returns the number of items in mergedArr.
	public static int mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] mergedArr)
	{
		int i = 0, j = 0, k = 0;

		while (i < size1 && j < size2)
		{
			if (arr1[i] < arr2[j])
			{
				mergedArr[k] = arr1[i];
				i++;
				k++;
			} else
			{
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}

		if (j < size2)
		{
			for (int c = j; c < arr2.length; c++)
			{
				mergedArr[k] = arr2[c];
				j++;
				k++;
			}
		}

		if (i < size1)
		{
			for (int c = i; c < arr2.length; c++)
			{
				mergedArr[k] = arr1[c];
				k++;
				i++;
			}
		}
		return (size1 + size2);
	}

	public static void main(String[] args)
	{
		// Test just the reading and writing -- check contents of numbersout.txt
		int[] array1 = new int[100];
		int numElems1 = readArray(array1, "numbers.txt");
		writeArray(array1, numElems1, "numbersout.txt");

		// Test the sorting -- check contents of sortedout.txt
		selectionSort(array1, numElems1);
		writeArray(array1, numElems1, "sortedout.txt");

		// Read second array and test merging -- check contents of mergedout.txt
		int[] array2 = new int[100];
		int numElems2 = readArray(array2, "numbers2.txt");
		int[] array3 = new int[200];
		int numElems3 = mergeArrays(array1, numElems1, array2, numElems2, array3);
		writeArray(array3, numElems3, "mergedout.txt");

	}

}
