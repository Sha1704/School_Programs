/*
 * Created on: Oct 26, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class TestAirbnbListing
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String choice = null;

		AirbnbListing listing1 = new AirbnbListing("Spotlight Studio",
				new Address("22 N Main St.", "IL", "Normal", 61790), "Studio", 50);

		AirbnbListing listing2 = new AirbnbListing("RedBird Apartment",
				new Address("200 College Ave.", "IL", "Normal", 6170), "Apartment", 85);

		AirbnbListing listing3 = new AirbnbListing("TownHouse near Rivian",
				new Address("13 Mulbery St.", "IL", "Bloomington", 61704), "Town House", 250);

		AirbnbListing listing4 = new AirbnbListing("Themed Room in BNB",
				new Address("312 Alexander Blvd.", "IL", "Bloomington", 61701), "Private Room", 60);

		System.out.println("Welcome to Airbnb Booking");

		displayMenu();
		choice = scan.nextLine();

		while (!choice.equalsIgnoreCase("q"))
		{
			if (choice.equalsIgnoreCase("l"))
			{
				listAvailableListings(listing1, listing2, listing3, listing4);
			}

			else if (choice.equalsIgnoreCase("lc"))
			{
				listAvailableListingsByCity(listing1, listing2, listing3, listing4);
			} else if (choice.equalsIgnoreCase("lt"))
			{
				listAvailableListingsByType(listing1, listing2, listing3, listing4);
			} else if (choice.equalsIgnoreCase("lr"))
			{
				listAvailableListingsByRating(listing1, listing2, listing3, listing4);
			} else if (choice.equalsIgnoreCase("b"))
			{
				bookListing(listing1, listing2, listing3, listing4);
			} else if (!choice.equals("q"))
			{
				System.out.println("Invalid input");
				displayMenu();
				choice = scan.next();
				if (choice.equalsIgnoreCase("q"))
				{
					break;
				}
			}

			displayMenu();
			choice = scan.nextLine();
		}
		System.out.println("You have " + AirbnbListing.getTotalListings() + " lisitings available.");
	}

	public static void displayMenu()
	{
		System.out.println("Please choose one of the following:");
		System.out.println("L - list available listings");
		System.out.println("LC - list available listings by city");
		System.out.println("LT - list available listings by type");
		System.out.println("LR - list available listings by rating");
		System.out.println("B - Book a listing");
		System.out.println("Q - quit");
	}

	public static void displayTypes()
	{
		System.out.println("What type of unit are you looking for?");
		System.out.println("1 - Private room");
		System.out.println("2 - Studio");
		System.out.println("3 - Town house");
		System.out.println("4 - Entire apartment");
	}

	public static void displayListings(AirbnbListing listing1, AirbnbListing listing2, AirbnbListing listing3,
			AirbnbListing listing4)
	{
		System.out.println("Which listing do you want to book?");
		System.out.println("1 - " + listing1);
		System.out.println("2 - " + listing2);
		System.out.println("3 - " + listing3);
		System.out.println("4 - " + listing4);
	}

	public static int validateMinimumNights(AirbnbListing listing1, int nightStay)
	{
		while (nightStay < listing1.getMinNights())
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("The number of requested days does not meet the minimum nights required.");
			System.out.print("Please request a valid number of days: ");
			nightStay = scan.nextInt();
		}
		return nightStay;
	}

	public static void checkForReciept(AirbnbListing listing1, int numDays)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want a copy of your reciept (yes or no)?");
		String confirm = scan.next();

		if (confirm.equalsIgnoreCase("yes"))
		{
			listing1.displayReceipt(numDays);
		}
	}

	public static void listAvailableListings(AirbnbListing listing1, AirbnbListing listing2, AirbnbListing listing3,
			AirbnbListing listing4)
	{
		System.out.println("Code	Listing name 		City	Rating 		Type");
		System.out.println(listing1);
		System.out.println(listing2);
		System.out.println(listing3);
		System.out.println(listing4);
	}

	public static void listAvailableListingsByType(AirbnbListing listing1, AirbnbListing listing2,
			AirbnbListing listing3, AirbnbListing listing4)
	{
		Scanner scan = new Scanner(System.in);
		displayTypes();
		int choice = scan.nextInt();
		String type = null;

		if (choice == 1)
		{
			type = "Private room";
		} else if (choice == 2)
		{
			type = "Studio";
			System.out.println("Test");
		} else if (choice == 3)
		{
			type = "Town house";
		} else if (choice == 4)
		{
			type = "Apartment";
		} else
		{
			System.out.println("There are no listing of this type");
		}

		if (listing1.getListingType().equalsIgnoreCase(type))
		{
			System.out.println("Listings of type: " + type);
			System.out.println(listing1);
		}

		else if (listing2.getListingType().equalsIgnoreCase(type))
		{
			System.out.println("Listings of type: " + type);
			System.out.println(listing2);
		}

		else if (listing3.getListingType().equalsIgnoreCase(type))
		{
			System.out.println("Listings of type: " + type);
			System.out.println(listing3);
		}

		else if (listing4.getListingType().equalsIgnoreCase(type))
		{
			System.out.println("Listings of type: " + type);
			System.out.println(listing4);
		}
	}

	public static void listAvailableListingsByCity(AirbnbListing listing1, AirbnbListing listing2,
			AirbnbListing listing3, AirbnbListing listing4)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("What city do you want? ");
		String choice = scan.next();

		if (listing1.getLocation().getCity().equalsIgnoreCase(choice))
		{
			System.out.println(listing1);
		}

		if (listing2.getLocation().getCity().equalsIgnoreCase(choice))
		{
			System.out.println(listing2);
		}

		if (listing3.getLocation().getCity().equalsIgnoreCase(choice))
		{
			System.out.println(listing3);
		}

		if (listing4.getLocation().getCity().equalsIgnoreCase(choice))
		{
			System.out.println(listing4);
		}
	}

	public static void listAvailableListingsByRating(AirbnbListing listing1, AirbnbListing listing2,
			AirbnbListing listing3, AirbnbListing listing4)
	{
		double choice = -1.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the minimum rating you are looking for? ");

		while (choice < 0)
		{
			if (scan.hasNextDouble())
			{
				choice = scan.nextDouble();
				if (choice < 0)
				{
					System.out.println("Please enter a positive number for rating.");
				}

			} else
			{
				System.out.println("Please enter a valid number.");
				scan.next();
			}
		}

		if (listing1.getAverageRating() >= choice)
		{
			System.out.println(listing1);
		}

		if (listing2.getAverageRating() >= choice)
		{
			System.out.println(listing2);
		}

		if (listing3.getAverageRating() >= choice)
		{
			System.out.println(listing3);
		}

		if (listing4.getAverageRating() >= choice)
		{
			System.out.println(listing4);
		}

	}

	public static void bookListing(AirbnbListing listing1, AirbnbListing listing2, AirbnbListing listing3,
			AirbnbListing listing4)
	{
		Scanner scan = new Scanner(System.in);

		displayListings(listing1, listing2, listing3, listing4);
		int choice = scan.nextInt();

		while (choice < 1 || choice > 4)
		{
			System.out.print("Please choose option 1 -4 ");
			choice = scan.nextInt();
		}

		System.out.println("How many days do you want to book the listing for?");
		int days;

		while (!(scan.hasNextInt()))
		{
			System.out.print("Please enter a number:");
			days = scan.nextInt();
		}
		days = scan.nextInt();

		if (choice == 1)
		{
			validateMinimumNights(listing1, days);
			listing1.bookListing(days);
			checkForReciept(listing1, days);
		} else if (choice == 2)
		{
			validateMinimumNights(listing2, days);
			listing2.bookListing(days);
			checkForReciept(listing2, days);
		} else if (choice == 3)
		{
			validateMinimumNights(listing3, days);
			listing3.bookListing(days);
			checkForReciept(listing3, days);
		} else if (choice == 4)
		{
			validateMinimumNights(listing4, days);
			listing4.bookListing(days);
			checkForReciept(listing4, days);
		}

	}
}