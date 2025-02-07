/*
 * Created on: Feb 27, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This class controls the flow of the whole program>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean again = true;

		System.out.println("Welcome to the Polynomial Addition Program.");

		try
		{
			while (again)
			{
				System.out.print("Please enter your first polynomial:");
				String input1 = scan.nextLine();

				while (input1.isEmpty())
				{
					System.out.print("Please enter your first polynomial(this cannot be empty): ");
					input1 = scan.nextLine();
				}

				System.out.print("Please enter the second polynomial:");
				String input2 = scan.nextLine();

				while (input2.isEmpty())
				{
					System.out.print("Please enter your second polynomial(this cannot be empty): ");
					input2 = scan.nextLine();
				}

				Polynomial p1 = new Polynomial(input1.trim());
				Polynomial p2 = new Polynomial(input2.trim());

				System.out.println("The sum is:");
				System.out.println(p1.addPolynomial(p2));

				System.out.print("Would you like to add 2 more polynomials? (enter yes or no): ");
				String more = scan.next();
				scan.nextLine();

				while (!(more.equalsIgnoreCase("yes") || more.equalsIgnoreCase("no")))
				{
					System.out.print("Please enter yes or no: ");
					more = scan.next();
				}

				if (more.equalsIgnoreCase("no"))
				{
					again = false;
					System.out.println("Thank you for using the Polynomial Addition Program.");
				}
			}
		} catch (NumberFormatException e)
		{
			System.out.println("Number Format Exception " + e.getMessage() + " please run the program again");
		} catch (NullPointerException e)
		{
			System.out.println(" Null Pointer Exception " + e.getMessage() + " please run the program again");
		}
	}
}