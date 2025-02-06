/*
 * Created on: Sep 26, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This program calculates the number of odd integers in the number entered by
 * the user>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input, number, sum;
		number = 1;
		sum = 0;

		System.out.print("Enter the number of odd numbers you want added: ");
		input = scan.nextInt();

		while (input != 0)
		{
			if (input == 1)
			{
				System.out.print(number + "=");
			} else
			{
				System.out.print(number + "+");
			}
			sum = sum + number;
			input--;
			number = number + 2;
		}
		System.out.println(sum);
	}

}
