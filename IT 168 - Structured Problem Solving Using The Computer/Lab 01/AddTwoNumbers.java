package edu.ilstu;

import java.util.Scanner;

/**
 * Class to add two numbers
 * 
 * @author Cathy Holbrook, Adiboshi Shalom
 */
public class AddTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); // creates a new scanner object and names it keyboard

		double num1 = 0.0;// creates a double named num1
		double num2 = 0.0;// creates a double named num2

		System.out.println("Hello");
		System.out.println("I will subtract two numbers for you.");
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();// uses the scanner named keyboard and saves it as num1

		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();// uses the scanner named keyboard and saves it as num2

		System.out.print("The result is: ");
		System.out.println(num1 - num2);// Prints out the result of num1 - num2

	}
}
