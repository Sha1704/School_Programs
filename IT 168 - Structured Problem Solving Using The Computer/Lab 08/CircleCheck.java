/*
 * Created on: Oct 10, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This program allows use for find the exact value fore the circle are,
 * diameter, and circumference>
 *
 * @author <Shalom Adiboshi and Sarah Akanbi;
 *
 */
public class CircleCheck
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double radius;

		System.out.print("Enter the radius of your cirlce: ");
		radius = scan.nextDouble();

		Circle c1 = new Circle(radius);

		System.out.println(c1.toString());

	}

}
