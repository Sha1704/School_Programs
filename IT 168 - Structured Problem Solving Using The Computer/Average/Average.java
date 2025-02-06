/*
 * Created on: Nov 28, 2023
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
public class Average
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int average;
		int sum = 0;
		int size = 0;

		System.out.print("Please enter the number of classes: ");
		int classes = scan.nextInt();

		int[] arr = new int[classes];

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter the size of class " + (i + 1) + ": ");
			size = scan.nextInt();
			arr[i] = size;
			sum += size;
		}
		average = sum / 2;
		System.out.println("The average class size is: " + average + ".");

		System.out.println("Class \t \t Number of students");
		for (int i = 0; i < classes; i++)
		{
			System.out.println((i + 1) + "\t \t" + size);
		}
	}

}
