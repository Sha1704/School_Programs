/*
 * Created on: Oct 3, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
import java.util.Scanner;

public class Smallest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input;
		int min = 0;

		System.out.print("Please enter a number (-999 to quit):");
		input = scan.nextInt();
		min = input;

		while (input != -999)
		{
			if (input < min)
			{
				min = input;
			}
			System.out.print("Please enter another number (-999 to quit):");
			input = scan.nextInt();
		}
		System.out.println("The smallest of your number was " + min);
	}

}
