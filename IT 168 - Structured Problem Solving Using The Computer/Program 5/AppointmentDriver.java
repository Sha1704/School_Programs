/*
 * Created on: Nov 13, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This class is the class that will retrieve the content from the arrays and
 * output them. It has the main method>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class AppointmentDriver
{
	static Scanner scan = new Scanner(System.in);
	static AppointmentBook appoint = new AppointmentBook();

	public static void main(String[] args)
	{
		AppointmentBook a1 = new AppointmentBook();
		displayMenu();
		int input = scan.nextInt();
		while (input != 4)
		{
			if (input == 1)
			{
				System.out.println("What period do you want to schedule your appointment?");
				int period = scan.nextInt();
				while (period < 1 || period > 8)
				{
					System.out.println("Invalid period, enter a valid period (1 -8).");
					period = scan.nextInt();
				}

				System.out.println("How long do you want to schedule your appointment for?");
				int duration = scan.nextInt();

				while (duration < 1 || duration > 60)
				{
					System.out.println("Invalid duration, enter a valid duration (1 -60).");
					duration = scan.nextInt();
				}
				requestAppointment(period, duration);
			} else if (input == 2)
			{
				printSchedules(2);
			} else if (input == 3)
			{
				printSchedules(3);
			}
			if (input < 1 || input > 4)
			{
				System.out.println("Invalid input, please select a valid number (1 - 4)");
			}
			displayMenu();
			input = scan.nextInt();
		}
		System.out.println("Goodbye!");
	}

	public static void displayMenu()
	{
		System.out.println("What would you like to do?");
		System.out.println("1--Schedule an appointment");
		System.out.println("2--List Period Schedule");
		System.out.println("3--List Full Schedule");
		System.out.println("4—Quit");
	}

	public static void requestAppointment(int period, int duration)
	{
		boolean boo = appoint.makeAppointment(period, duration);
		if (boo == true)
		{
			System.out.println("Your " + duration + " minute appointment has been scheduled");
		} else
		{
			System.out.println(duration + " minutes is not available during period " + period);
		}
	}

	public static void printSchedules(int code)
	{
		if (code == 2)
		{
			System.out.println("What period do you want to print?");
			int period = scan.nextInt();
			while (period < 1 || period > 8)
			{
				System.out.println("Invalid period, enter a valid period (1 -8).");
				period = scan.nextInt();
			}
			System.out.println(appoint.getPeriod()[period - 1]);
		}
		if (code == 3)
		{
			System.out.println("Period 1");
			System.out.println(appoint.getPeriod()[0]);
			System.out.println("Period 2");
			System.out.println(appoint.getPeriod()[1]);
			System.out.println("Period 3");
			System.out.println(appoint.getPeriod()[2]);
			System.out.println("Period 4");
			System.out.println(appoint.getPeriod()[3]);
			System.out.println("Period 5");
			System.out.println(appoint.getPeriod()[4]);
			System.out.println("Period 6");
			System.out.println(appoint.getPeriod()[5]);
			System.out.println("Period 7");
			System.out.println(appoint.getPeriod()[6]);
			System.out.println("Period 8");
			System.out.println(appoint.getPeriod()[7]);
		}
	}

}
