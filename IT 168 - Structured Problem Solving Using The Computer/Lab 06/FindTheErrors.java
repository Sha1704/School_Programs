/*
 *  Created on 
 *
 *  ULID:  
 *  Class: IT 168
 *
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * The following class has four independent debugging problems. Solve one at a
 * time, uncommenting the next one only after the previous problem is working
 * correctly.
 *
 * @author <Adiboshi Shalom>
 *
 */
public class FindTheErrors
{

	public static void main(String[] args)
	{
		// problem 1
		Scanner keyboard = new Scanner(System.in);

		String firstName = "";
		String lastName = "";
		String school = "";
		int year = 0;

		System.out.print("Enter your first name:  ");
		firstName = keyboard.nextLine();

		System.out.print("Enter the current year:  ");
		year = keyboard.nextInt();

		System.out.print("Enter your last name:  ");
		lastName = keyboard.next();

		System.out.print("You are " + firstName + " " + lastName + " and it is the year " + year);

		keyboard.nextLine();
		System.out.println("\n");

		// problem 2

		int num1 = 0;
		int num2 = 0;

		System.out.print("Enter a number - 1, 2, or 3: ");
		num1 = keyboard.nextInt();

		if (num1 == -1)
		{
			num2 = 0;
		} else if (num1 == 0)
		{
			num2 = 1;
		} else if (num1 == 1)
		{
			num2 = 2;
		} else if (num1 == 2)
		{
			num2 = 3;
		} else if (num1 == 3)
		{
			num2 = 4;
		} else
		{
			num2 = num1 + 1;
		}

		System.out.println("num1 = " + num1 + " and num2 = " + num2);

		System.out.println("\n");

		// problem 3
		String courseName = "";

		System.out.print("Enter your course name (IT168 or IT177): ");
		courseName = keyboard.nextLine();

		if (courseName.toUpperCase().equals("IT168"))
		{
			System.out.println("You are taking IT168.");
		} else if (courseName.toUpperCase().equals("IT177"))
		{
			System.out.println("You are taking IT177.");
		} else
		{
			System.out.println("Invalid input.");
		}

		System.out.println("\n");

		// Problem 4

		int score = 0;
		char grade = 'Z';

		System.out.print("Enter your test grade (1-100): ");
		score = keyboard.nextInt();

		if (score >= 90)
		{
			score = 90;
		} else if (score >= 80)
		{
			score = 80;
		} else if (score >= 70)
		{
			score = 70;
		} else if (score >= 60)
		{
			score = 60;
		}

		switch (score)
		{
		case (60):
			grade = 'D';
			break;
		case (70):
			grade = 'C';
			break;
		case (80):
			grade = 'B';
			break;
		case (90):
			grade = 'A';
			break;
		default:
			grade = 'F';
		}

		System.out.println("The score " + score + " will have a grade of " + grade + ".");
	}
}
