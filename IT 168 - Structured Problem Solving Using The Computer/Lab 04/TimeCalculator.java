/*
 * Created on: Sep 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This class will calculate the number of hours, minutes, and seconds from the
 * number of seconds the user entered.>
 *
 *
 * @author <Shalom Adiboshi & Steve Zadro;
 *
 */
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int time, hours, minutes, seconds;
		System.out.println("Enter a number: ");
		time = scan.nextInt(); // takes number from the user.
		hours = time / 3600;
		minutes = (time % 3600) / 60;
		seconds = time % 60;
		System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);

	}

}
