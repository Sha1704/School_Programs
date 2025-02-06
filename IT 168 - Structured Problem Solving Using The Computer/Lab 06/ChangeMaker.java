/*
 * Created on: Sep 26, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This program calculates the change a vending machine returns to the user in
 * coins based on the item cost>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int price, change;

		System.out.println("ITem price must be 25 cents to a dollar, in 5-cent increments.");

		System.out.print("Enter item price: ");
		price = scan.nextInt();

		if (price < 25)
		{
			System.out.println("Cost is invalid - it must be at least 25 cents");
			System.out.print("Enter item price: ");
			price = scan.nextInt();
		}

		if (price > 100)
		{
			System.out.println("Cost is invalid - it must be no more than 100 cents.");
			System.out.print("Enter item price: ");
			price = scan.nextInt();
		}

		if (price % 5 != 0)
		{
			System.out.println("Cost is invalid - it must be evenly divisible by 5.");
			System.out.print("Enter item price: ");
			price = scan.nextInt();
		}

		change = 100 - price;

		if (change == 25)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 1 Quarter");
		}

		else if (change == 35)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 1 Quarter and 1 dime");
		}

		else if (change == 45)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 1 Quarter and 2 dimes");
		}

		else if (change == 55)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 2 Quarters and 1 nickle");
		}

		else if (change == 65)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 2 Quarters, 1 dime and 1 nickle");
		}

		else if (change == 75)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 3 Quarters");
		}

		else if (change == 85)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 3 Quarters and 1 dime");
		}

		else if (change == 95)
		{
			System.out.print("You bought an item for " + price + " cents and gave me a dollar");
			System.out.print("Your change is: 3 Quarters and 2 dimes");
		}

		else if (change == 0)
		{
			System.out.println("You bought an item for one dollar and gave me a dollar");
			System.out.print("You have no change to recieve");
		}

	}
}