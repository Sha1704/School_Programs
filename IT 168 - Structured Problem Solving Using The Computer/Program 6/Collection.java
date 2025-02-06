/* 
* Created on: Dec 2, 2023 
* 
* ULID: <sadibos> 
* Class: IT 168  
*/ 
package edu.ilstu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

/** 
* <This class manages a group of vehicles in jay's collection. 
* It stores information about vehicles and allows adding, removing, updating, and displaying their details.> 
* 
* @author <Shalom Adiboshi; 
*  
*/
public class Collection 
{
	private Vehicle[] collection;
	private int numCars;
	
	public Collection()
	{
		collection = new Vehicle[20]; // size 20 based on update
		numCars = 0;
	}
	
	public int getNumCars()
	{
		return numCars;
	}

	public void readFile(String fileName)
	{
		try 
		{
			Scanner read = new Scanner (new FileReader(fileName));
			while (read.hasNext())
			{
				String plateNumber = read.nextLine();
				int yearBuilt = read.nextInt();
				String manufacturer = read.nextLine();
				String model = read.nextLine();
				model = model.substring(0, model.lastIndexOf(" "));
				String exteriorColor = read.nextLine();
				String vehicleType = read.nextLine();
				String dateAcquired = read.nextLine();
				double value = read.nextDouble();
				read.nextLine();
				double cost = read.nextDouble();
				read.nextLine();
				boolean workNeeded = read.nextBoolean();
				read.nextLine();
				String workNotes = read.nextLine();
				read.nextLine();
				
				Vehicle v1 = new Vehicle(plateNumber, yearBuilt, dateAcquired, manufacturer, vehicleType,
						model, exteriorColor, workNeeded, workNotes, cost, value);
				addVehicle(v1);
			}
			read.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println ("File not found exception: " + e.getMessage());
		}
		catch (NullPointerException e)
		{
			System.out.println ("Null pointer exception: " + e.getMessage());
		}
	}
	
	public void writeFile (String fileName)
	{
		try 
		{
			PrintWriter writeFile1 = new PrintWriter(new FileWriter (fileName,true));
			collection = sortArray();
			for (int i = 0; i < numCars; i++) // write the content of the array to the file
			{
				if (collection[i] != null)
				{
					writeFile1.write(collection[i].getPlateNumber() + "\n" + collection[i].getYearBuilt() + " " + collection[i].getManufacturer() + "\n" + collection[i].getModel() + "\n" + collection[i].getExteriorColor() + "\n" + collection[i].getVehicleType() + "\n" + collection[i].getDateAcquired() + "\n" + collection[i].getValue() + "\n" + collection[i].getCost() + "\n" + collection[i].getWorkNeeded() + "\n" + collection[i].getWorkNotes() + "\n" + "\n");
				}
			}
			writeFile1.close();
		} 
		catch (IOException e) 
		{
			System.out.println("IO exception: " + e.getMessage()); 
		}
		catch (NullPointerException n)
		{
			System.out.println("Null pointer exception: " + n.getMessage()); 
		}
	}
	
	private Vehicle[] sortArray() 
	{
	    Vehicle[] copy = new Vehicle[numCars];
	    for (int i = 0; i < numCars; i++)
	    {
	    	copy[i] = collection[i];
	    }
	    for (int i = 0; i < numCars - 1; i++) 
	    {
	        int maxIndex = i; //find the largest element of the array
	        for (int j = i + 1; j < numCars - 1; j++) 
	        {
	            if (collection[j].getPlateNumber().compareTo((collection[maxIndex].getPlateNumber()))>0) // compare plate number
	            {
	                maxIndex = j; // store index of larger number
	            }
	        }
	        Vehicle temp = collection[maxIndex];
	        collection[maxIndex] = collection[numCars - i - 1];
	        collection[numCars- i - 1] = temp; // switch the current element with the largest element
	    }
	    System.out.println("Vehicles written to file: " + numCars);
	    return collection;
	}
	
	public void addVehicle(Vehicle v1)
	{
		boolean onList = false;
		for (int i = 0; i < collection.length; i++)
		{
			if (collection[i] != null && collection[i].getPlateNumber().equals(v1.getPlateNumber())) //check if the vehicle is in the array
			{
				onList = true;
			}
		}
		if (onList == false)
		{
			boolean added = false;
			for (int i = 0; i < collection.length; i++)
			{
				if (collection.length > numCars)
				{
					collection[numCars] = v1;
					added = true;
				}
			}
			numCars++;
			if (added == false)
			{
				System.out.println("Collection is full, cannot add more vehicles.");
			}
		}
		else
		{
			System.out.println("The vehicle is already on the list");
		}
	}
	
	public void displayCollection()
	{
		System.out.println("JAY’S VEHICLE COLLECTION\nTag No.  \tYear Manuf. \tModel \t\t\t\t\tType \t\t\tAcquired");
		for (int i = 0; i < numCars; i++)
		{
			if (collection[i] != null) 
			{
				System.out.println(collection[i].getPlateNumber() + "\t \t" + collection[i].getYearBuilt() + "\t \t" + collection[i].getModel() + "\t\t" + collection[i].getVehicleType() + "\t \t\t" + collection[i].getDateAcquired());
			}
		}
	}
	
	public int needsWork()
	{
		int count = 0;
		DecimalFormat df = new DecimalFormat(".00");
		for (int i = 0; i < numCars; i++)
		{
			if (collection[i].getWorkNeeded() == true)
			{
				System.out.println("Plate number: " + collection[i].getPlateNumber() + "\nYear/Make/Model: " + collection[i].getYearBuilt() + " " + collection[i].getManufacturer() + " " + collection[i].getModel() + "\nColor: " + collection[i].getExteriorColor() + "\nType: " + collection[i].getVehicleType() + "\nDate Acquired: " + collection[i].getDateAcquired() + "\nPurchase Price: $" + df.format(collection[i].getCost()) + "\nCurrent Value: $" + df.format(collection[i].getValue()) + "\nNeeds work: " + collection[i].getWorkNeeded() + "\nNature Of Work Needed: " + collection[i].getWorkNotes());
				count++;
			}
		}
		return count;
	}
	
	public void updateVehicle(String plateNumber)
	{
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numCars; i++)
		{
			if (collection[i].getPlateNumber().equals(plateNumber))
			{
				System.out.println(collection[i].toString());
				
				int input = 0;
				while (input != 5)
				{
					System.out.println("Enter the field to update:");
					System.out.println("1-License Plate");
					System.out.println("2-Color");
					System.out.println("3-Current Value");
					System.out.println("4-Work Needed");
					System.out.println("5-Quit");
					
					boolean flag = true;
					
					while (flag)
					{
						if (scan.hasNextInt())
						{
							input = scan.nextInt();
							scan.nextLine();
							flag = false;
						}
						else
						{
							System.out.println("Invalid input. Try again");
							System.out.println("Enter the field to update:");
							System.out.println("1-License Plate");
							System.out.println("2-Color");
							System.out.println("3-Current Value");
							System.out.println("4-Work Needed");
							System.out.println("5-Quit");
							scan.nextLine();
						}
					}
					if (input == 1)
					{
						System.out.print("What is the new License Plate number? ");
						String newPlate = scan.nextLine();
						collection[i].setPlateNumber(newPlate);
					}
					else if (input == 2)
					{
						System.out.print("What is the new colour? ");
						String colour = scan.nextLine();
						collection[i].setExteriorColor(colour);
					}
					else if (input == 3)
					{
						System.out.print("What is the new current value? ");
						double value = scan.nextDouble();
						collection[i].setValue(value);
					}
					else if (input == 4)
					{
						System.out.print("Is there any work needed on the vehicle (enter yes or no)? ");
						String needed = scan.nextLine();
						if (needed.equalsIgnoreCase("yes") || needed.equalsIgnoreCase("no"))
						{
							if (needed.equalsIgnoreCase("yes"))
							{
								collection[i].setWorkNeeded(true);
								System.out.print("What is the nature of the work needed? ");
								String nature = scan.nextLine();
								collection[i].setWorkNotes(nature);
							}
							else if (needed.equalsIgnoreCase("no"))
							{
								collection[i].setWorkNeeded(false);
							}
						}
					}
				}
			}
		}
	}
	
	public void displayVehicle(String plateNumber)
	{
		boolean flag = false;
		DecimalFormat df = new DecimalFormat(".00");
		for (int i = 0; i < numCars; i++)
		{
			if (collection[i].getPlateNumber().equals(plateNumber))
			{
				System.out.println("Plate number: " + collection[i].getPlateNumber() + "\nYear/Make/Model: " + collection[i].getYearBuilt() + " " + collection[i].getManufacturer() + " " + collection[i].getModel() + "\nColor: " + collection[i].getExteriorColor() + "\nType: " + collection[i].getVehicleType() + "\nDate Acquired: " + collection[i].getDateAcquired() + "\nPurchase Price: $" + df.format(collection[i].getCost()) + "\nCurrent Value: $" + df.format(collection[i].getValue()) + "\nNeeds work: " + collection[i].getWorkNeeded() + "\nNature Of Work Needed: " + collection[i].getWorkNotes());
				flag = true;
			}
		}
		if (!flag)
		{
			System.out.println("Could not find vehicle with plate number " + plateNumber);
		}
	} 
	
	public void removeVehicle(String plateNumber) 
	{
		boolean found = false;
	    for (int i = 0; i < numCars; i++) 
	    {
	        if (collection[i] != null && collection[i].getPlateNumber().equals(plateNumber)) 
	        {
	        	found = true;
	            for (int j = i; j < numCars; j++) 
	            {
	                collection[j] = collection[j + 1];
	            }
	            collection[numCars - 1] = null;
	            System.out.println("Vehicle removed");
	            int update = getNumCars();
	            update--;
	            System.out.print("Number of vehicles in collection: " + update);
	            break;
	        }
	    }
	    
	    if (found == false)
	    {
	    	System.out.println("Vehicle with plate number " + plateNumber + " was not found");
	    }
	}

}
