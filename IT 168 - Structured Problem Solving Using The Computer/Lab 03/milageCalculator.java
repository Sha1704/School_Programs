/*
 * Created on: Sep 5, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This program calculated the miles per gallon based on the miles and gallons
 * inputed by the user>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class milageCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int milesTraveled;
		int gallonUsed;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of miles driven: ");
		milesTraveled = scan.nextInt();
		System.out.println("Enter the number of gallons used ");
		gallonUsed = scan.nextInt();

		float mpg = (float) gallonUsed / milesTraveled;

		System.out.println("Your MPG was: " + mpg);

	}

}
