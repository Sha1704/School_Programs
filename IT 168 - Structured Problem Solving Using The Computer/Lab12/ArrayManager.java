package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <insert class description here>
 * 
 * @author Mary Elaine Califf and
 *
 */
public class ArrayManager
{
	int[] arrays;
	int count;
	// declare instance variables here

	public ArrayManager()
	{
		arrays = new int[100];
		for (int i = 0; i < arrays.length; i++)
		{
			arrays[i] = 0;
		}
	}

	public void fillArray()
	{
		int curVal;

		Scanner input = null;
		try
		{
			input = new Scanner(new File("data.txt"));
			count = 0;
			// set the current number of items in the array to zero
			while (input.hasNextInt())
			{
				curVal = input.nextInt();

				arrays[count] = curVal;
				count++;

				// add code to store curVal into the array and update other information as
				// needed
			}
			input.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not find data.txt file");
			System.exit(1);
		}
	}

	public int findSmallestValue()
	{
		int min = arrays[0];
		for (int i = 0; i < count; i++)
		{
			if (arrays[i] < min)
			{
				min = arrays[i];
			}
		}
		return min;
	}

	public int findLargestValue()
	{
		int max = arrays[0];
		for (int i = 0; i < count; i++)
		{
			if (arrays[i] > max)
			{
				max = arrays[i];
			}
		}
		return max;
	}

	public int findIndex(int num)
	{
		int index = -1;
		for (int i = 0; i < count; i++)
		{
			if (arrays[i] == num)
			{
				index = i;
			}
		}
		return index;
	}

}
