/*
 * Created on: Jan 27, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <This class has the main method required to run the program as well as the method to display the menu>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainClass
{
	public static void main(String[] args)
	{
		try
		{
			SalesReport s1 = new SalesReport("Sales.csv");
			boolean loop = false;
			
			Scanner scan = new Scanner(System.in);
			
			displayMenu();
			int input = scan.nextInt();
				while (input !=5)
				{
					if (input < 1 || input > 5)
					{
						System.out.println("Invlid input, select a valid input (1-5)");
						input = scan.nextInt();
					}
					else
					{
						if (input ==1)
						{
							if (!loop)
							{
								System.out.print ("Enter the file name: ");
								String name = scan.next();
								s1.readFile(name);
								scan.nextLine();
								displayMenu();
								input = scan.nextInt();
								loop = true;
							}
							else
							{
								System.out.println ("You already read a file, please restart the program to read another file.");
								break;
							}
						}
						else if (input ==2)
						{
							s1.printSalesPeople();
							scan.nextLine();
							displayMenu();
							input = scan.nextInt();
						}
						else if (input ==3)
						{
							System.out.print("Enter the name of the sales person: ");
							scan.nextLine();
							String salesPerson = scan.nextLine();
							s1.writeFile(salesPerson);
							displayMenu();
							input = scan.nextInt();
						}
						else if (input ==4) // not working
						{
							String str = s1.getStats();	
							System.out.println(str);
							displayMenu();
							input = scan.nextInt();
						}
					}
				}
				System.out.println("Goodbye!");
		}
		catch (InputMismatchException e)
		{
			System.out.println("You entered the wrong input type, please run the program again.");
		}
		}
	public static void displayMenu()
	{
		System.out.println("Select one of the following options");
		
		System.out.println("1. Enter the file name to process");
		System.out.println("2. Print a list of all sales people");
		System.out.println("3. Generate a report for a specific salesperson");
		System.out.println("4. Display statistics.");
		System.out.println("5. Exit");
	}	
}
