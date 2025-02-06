/*
 * Created on: Oct 3, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This program prints a right angled triangle based on the user's input>
 *
 * @author <Shalom Adiboshi, Jasmine Ogufere;
 *
 */
import java.util.Scanner;

public class PrintTriangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input;

		System.out.print("Enter an interger between 3 and 20: ");
		input = scan.nextInt();

		while (input < 3 || input > 20)
		{
			System.out.print("Enter an interger between 3 and 20: ");
			input = scan.nextInt();
		}
		for (int i = 0; i < input; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
