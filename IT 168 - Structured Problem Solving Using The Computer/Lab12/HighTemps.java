/*
 * Created on: Nov 14, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class HighTemps
{
	public static void main(String[] args)
	{
		int[] tempCount = new int[151];
		int count = 0;
		int max = tempCount[0];

		Scanner input = null;
		try
		{
			input = new Scanner(new File("temps.txt"));
			while (input.hasNextInt())
			{
				int days = input.nextInt();
				tempCount[days + 40]++;
			}
			System.out.println("Temperature \t \t Number of days");
			for (int i = 0; i < 151; i++)
			{
				if (tempCount[i] > 0)
				{
					System.out.println((i - 40) + "\t \t \t " + tempCount[i]);
				}
			}
			input.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not find data.txt file");
			System.exit(1);
		}
	}
}
