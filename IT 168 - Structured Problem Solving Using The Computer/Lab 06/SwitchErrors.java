/*
 * Created on 
 * 
 * ULID: 
 * Class: IT 168
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This code gives the user a color based on the number they entered>
 *
 * @author <Adiboshi Shalom>
 *
 */
public class SwitchErrors
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;

		System.out.println("Key:  1=blue, 2=red, 3=green");

		System.out.print("Enter a number and I'll return the corresponding color: ");
		number = keyboard.nextInt();

		switch (number)
		{
		case (1):
			System.out.println("You chose blue!");
			break;
		case (2):
			System.out.println("You chose red!");
			break;
		case (3):
			System.out.println("You chose green!");
		default:
			System.out.println("Color not available!");
			break;
		}
	}

}
