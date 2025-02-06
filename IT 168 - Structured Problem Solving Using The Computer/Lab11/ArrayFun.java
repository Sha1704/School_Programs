/*
 * Created on: Oct 31, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class ArrayFun
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] array = new int[100];
		int counter = 0;

		counter = fillArray(array, scan);
		System.out.println("The product of the numbers in the array is " + computeProduct(array, counter));
		System.out.print("Enter an integer for factor: ");
		int factor = scan.nextInt();
		System.out.println(
				"The number of valid numbers divisible by the factor are: " + countMultiples(array, counter, factor));
		printArray(array, counter);

	}

	public static int fillArray(int[] array, Scanner scan)
	{
		System.out.println("What values do you want to add to the array?");
		int values = scan.nextInt();
		int count = 0;

		while (values != -999)
		{
			array[count] = values;
			count++;
			System.out.println("input another value (-999 to stop)");
			values = scan.nextInt();
		}
		return count;
	}

	public static int computeProduct(int[] array, int valid)
	{
		int product = 1;
		for (int i = 0; i < valid; i++)
		{
			product *= array[i];
		}
		return product;
	}

	public static int countMultiples(int[] array, int valid, int factor)
	{
		int count1 = 0;
		for (int i = 0; i < valid; i++)
		{
			if (array[i] % factor == 0)
			{
				count1++;
			}
		}
		return count1;
	}

	public static void printArray(int[] array, int valid)
	{
		for (int i = 0; i < valid; i++)
		{
			System.out.println(array[i]);
		}
	}
}
