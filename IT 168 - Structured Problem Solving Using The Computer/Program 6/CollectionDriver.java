/* 
* Created on: Dec 3, 2023 
* 
* ULID: <sadibos> 
* Class: IT 168  
*/ 
package edu.ilstu;

import java.util.Scanner;

/** 
* <This class contains the main method and other methods to interact with the Collection class. 
* It has a menu for users to add, edit, search, display, and change vehicle information.> 
* 
* @author <Shalom Adiboshi; 
*  
*/
public class CollectionDriver 
{
	 static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Collection c1 = new Collection();
		setup(c1);
	}
	
	public static void setup(Collection collect)
	{
		String[] menu = {"Add a Vehicle", "Edit a Vehicle", "Search for a Vehicle", "Display Vehicles That Need Work", "Display the Entire Collection", "Load from a file", "Write to a file", "Delete a Vehicle", "Quit"};
		TextMenu t1 = new TextMenu(menu);
		int choice = t1.getChoice();
		
		while (choice != 9)
		{
			if (choice == 1)
			{
				System.out.print("Enter the plate number: ");
				String plate = scan.nextLine();
				Vehicle v1 = addVehicle(plate);
				collect.addVehicle(v1);
				System.out.print("Number of vehicles in collection: " + collect.getNumCars());
				choice = t1.getChoice();
			}
			if (choice == 2)
			{
				System.out.print("What is the plate number of the vehicle you want to edit: ");
				String plate = scan.nextLine();
				collect.updateVehicle(plate);
				choice = t1.getChoice();
			}
			if (choice == 3)
			{
				System.out.print("What is the plate number of the vehicle you want to search for: ");
				String plate = scan.nextLine();
				collect.displayVehicle(plate);
				choice = t1.getChoice();
			}
			if (choice == 4)
			{
				int count = collect.needsWork();
				System.out.print("Number of vehicles that needs work: " + count);
				choice = t1.getChoice();
			}
			if (choice == 5)
			{
				collect.displayCollection();
				System.out.print("Number of vehicles in collection: " + collect.getNumCars());
				choice = t1.getChoice();
			}
			if (choice == 6)
			{
				System.out.print("Enter the name of the file to be read: ");
				String fileName = scan.nextLine();
				collect.readFile(fileName);
				System.out.print("Number of vehicles in collection: " + collect.getNumCars());
				choice = t1.getChoice();
			}
			if (choice == 7)
			{
				System.out.print("What is the name of the file you want to write to: ");
				String fileName = scan.nextLine();
				collect.writeFile(fileName);
				choice = t1.getChoice();
			}
			if (choice == 8)
			{
				System.out.print("What is the plate number of the vehicle you want to remove: ");
				String plate = scan.nextLine();
				System.out.println("Are you sure? (yes/no): ");
				String input = scan.next();
				while (scan.hasNextLine())
				{
					if (input.equalsIgnoreCase("yes"))
					{
						collect.removeVehicle(plate);
						break;
					}
					else
					{
						System.out.println("Vehicle removal stopped because of invalid input or due to request");
						break;
					}
				}
				choice = t1.getChoice();
			}
		}
		System.out.println("Program Exiting.");
		System.out.println("Thank you for using jays cars collection");
	}
	
	public static Vehicle addVehicle(String plateNumber)
	{
		boolean workNeeded = false;
		
		
		System.out.print("Enter year of vehicle: ");
		int yearBuilt = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the manufacturer: ");
		String manufacturer = scan.nextLine();
		System.out.print("Enter the model of vehicle: ");
		String model = scan.nextLine();
		System.out.print("Enter the color: ");
		String exteriorColor = scan.nextLine();
		System.out.print("Enter the type of vehicle: ");
		String vehicleType = scan.nextLine();
		System.out.print("Enter the date acquired: ");
		String dateAcquired = scan.nextLine();
		System.out.print("Enter the purchase price: ");
		double cost = scan.nextDouble();
		System.out.print("Enter the current value: ");
		double value = scan.nextDouble();
		System.out.print("Is there any work needed on the vehicle (enter yes or no): ");
		String val = scan.nextLine();
		while (!(val.equalsIgnoreCase("yes") || val.equalsIgnoreCase("no")))
		{
			System.out.print("Enter a valid value (yes or no): ");
			val = scan.nextLine();
		}
		if (val.equalsIgnoreCase("yes") || val.equalsIgnoreCase("no"))
			{
				if (val.equalsIgnoreCase("yes"))
				{
					workNeeded = true;
				}
				else
				{
					workNeeded = false;
				}
			}
		System.out.print("Enter nature of the work required (enter “none” if none needed): ");
		String workNotes = scan.nextLine();
		Vehicle v1 = new Vehicle(plateNumber, yearBuilt, dateAcquired, manufacturer, vehicleType,
				model, exteriorColor, workNeeded, workNotes, cost, value);
		
		return v1;
	}
}
