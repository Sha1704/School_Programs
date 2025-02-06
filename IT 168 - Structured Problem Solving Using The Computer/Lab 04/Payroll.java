/*
 * Created on: Sep 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <Calculates the payroll for two different employees with values entered in by
 * the user. Also calculates the percentage pay raise entered by the user.>
 *
 * @author <Shalom Adiboshi & Steve Zadro;
 *
 */
public class Payroll
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Employee james = new Employee("Addison", "James", 17.00);
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a first name: ");
		String firstname = scnr.nextLine();
		System.out.println("Enter a last name: ");
		String lastname = scnr.nextLine();
		System.out.println("Enter a rate: ");
		double rate = scnr.nextDouble();
		Employee user = new Employee(lastname, firstname, rate);
		user.print();
		james.print();

		james.calculatePay(42);
		user.calculatePay(40);

		james.printPayrollLine(42);
		user.printPayrollLine(40);

		System.out.print("Enter pay raise percent for james: ");
		double jraise = scnr.nextDouble();

		System.out.print("Enter pay raise percent for " + user.getFirstName() + ": ");
		double uraise = scnr.nextDouble();

		james.giveRaise(jraise);
		user.giveRaise(uraise);

		james.printPayrollLine(42);
		user.printPayrollLine(40);

		user.print();
		james.print();

	}

}
