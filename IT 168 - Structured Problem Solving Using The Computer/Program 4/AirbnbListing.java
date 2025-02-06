/*
 * Created on: Oct 23, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * <This class holds the relevant data that is needed to create an airbnb
 * listing>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class AirbnbListing // Write UML diagram
{
	public static int totalListings = 0;
	public final double CLEANING_FEE = 30.00;
	public final double SERVICE_FEE = 13.84;
	public final double TAX_RATE = 0.14;

	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("0.00");

	private String listingName, listingType, wifiName, wifiPassword, accessKey, confirmationCode;
	private int minNights, listingCode, nightStayed;
	private double pricePerNight, averageRating, tax;
	private Address location;

	public AirbnbListing()
	{
		listingCode = rand.nextInt(9999) + 1;
		wifiName = "Guest";
		wifiPassword = "BeMyGuest23";
		totalListings++;
	}

	public AirbnbListing(String name, Address location, String type, double pricePerNight)
	{
		this();
		listingName = name;
		this.location = new Address(location.getCity(), location.getState(), location.getAddress(),
				location.getZipcode());
		listingType = type;
		this.pricePerNight = pricePerNight;
		averageRating = rand.nextDouble(4) + 1;
		minNights = AirbnbListing.calcMinimumNights(type);
	}

	private static int calcMinimumNights(String type)
	{
		int nights = 0;
		if (type.toLowerCase().equals("studio"))
		{
			nights = 1;
		} else if (type.toLowerCase().equals("entire apartment"))
		{
			nights = 3;
		} else if (type.toLowerCase().equals("private room"))
		{
			nights = 1;
		} else if (type.toLowerCase().equals("town house"))
		{
			nights = 7;
		}

		return nights;
	}

	private void generateConfirmationCode()
	{
		int randomNumber = rand.nextInt(9999) + 1;
		confirmationCode = "" + listingName.charAt(0) + (location.getCity()).charAt(0) + listingType.charAt(0)
				+ randomNumber + randomNumber + randomNumber + randomNumber;
	}

	private void generateAccessCode()
	{
		accessKey = "" + rand.nextInt(9999) + 1;
	}

	private double calculateSubTotal()
	{
		return (SERVICE_FEE + CLEANING_FEE) + (pricePerNight * nightStayed);
	}

	private void calculateTax(double subTotal)
	{
		subTotal = this.calculateSubTotal();
		this.tax = subTotal * TAX_RATE;
	}

	public static int getTotalListings()
	{
		return totalListings;
	}

	public static void setTotalListings(int totalListings)
	{
		AirbnbListing.totalListings = totalListings;
	}

	public String getListingName()
	{
		return listingName;
	}

	public void setListingName(String listingName)
	{
		this.listingName = listingName;
	}

	public int getMinNights()
	{
		return minNights;
	}

	public void setMinNights(int minNights)
	{
		this.minNights = minNights;
	}

	public String getListingType()
	{
		return listingType;
	}

	public void setListingType(String listingType)
	{
		this.listingType = listingType;
	}

	public double getAverageRating()
	{
		return averageRating;
	}

	public void setAverageRating(double averageRating)
	{
		this.averageRating = averageRating;
	}

	public String getWifiName()
	{
		return wifiName;
	}

	public void setWifiName(String wifiName)
	{
		this.wifiName = wifiName;
	}

	public String getWifiPassword()
	{
		return wifiPassword;
	}

	public void setWifiPassword(String wifiPassword)
	{
		this.wifiPassword = wifiPassword;
	}

	public int getListingCode()
	{
		return listingCode;
	}

	public void setListingCode(int listingCode)
	{
		this.listingCode = listingCode;
	}

	public int getNightStayed()
	{
		return this.nightStayed;
	}

	public void setNightStayed(int nightStayed)
	{
		this.nightStayed = nightStayed;
	}

	public double getPricePerNight()
	{
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight)
	{
		this.pricePerNight = pricePerNight;
	}

	public double getTax()
	{
		return this.tax;
	}

	public void setTax(double tax)
	{
		this.tax = tax;
	}

	public String getAccessKey()
	{
		return accessKey;
	}

	public void setAccessKey(String accessKey)
	{
		this.accessKey = accessKey;
	}

	public String getConfirmationCode()
	{
		return confirmationCode;
	}

	public void setConfirmationCode(String confirmationCode)
	{
		this.confirmationCode = confirmationCode;
	}

	public Address getLocation()
	{
		return location;
	}

	public Address setLocation(Address location)
	{
		this.location = new Address(location.getCity(), location.getState(), location.getAddress(),
				location.getZipcode());
		return this.location;
	}

	public double getCLEANING_FEE()
	{
		return CLEANING_FEE;
	}

	public double getSERVICE_FEE()
	{
		return SERVICE_FEE;
	}

	public double getTAX_RATE()
	{
		return TAX_RATE;
	}

	public String toString()
	{

		return listingCode + "\t" + listingName + "\t" + location.getCity() + "\t" + df.format(averageRating)
				+ " stars \t" + listingType;
	}

	public double calculateTotalPrice(int numberOfNights)
	{
		double tp = (getPricePerNight() * numberOfNights) + (getCLEANING_FEE()) + (getSERVICE_FEE()) + (getTax());
		return tp;
	}

	public void bookListing(int nightRequested)
	{
		if (nightRequested > minNights)
		{
			System.out.println("The requested number of night is less than the minimun number of nights required");
		} else
		{
			generateConfirmationCode();
			generateAccessCode();

			calculateTotalPrice(nightRequested);

			System.out.println("Summary of your trip:");
			System.out.println("Your Wifi username: " + wifiName + ", password: " + wifiPassword);
			System.out.println("Address: " + location);
			System.out.println("Check-in: after 3:00pm");
			System.out.println("Check-out: by 10:00am");
			System.out.println("Total (USD)               $" + calculateTotalPrice(nightRequested));
		}
	}

	public void displayReceipt(int nightStayed)
	{
		double tot = calculateTotalPrice(nightStayed);
		System.out.println("Price breakdown");
		System.out.println("$" + getPricePerNight() + " X " + nightStayed + " Night(s)");
		System.out.println("Cleaning Fee:   $" + getCLEANING_FEE());
		System.out.println("Service fee:      $" + getSERVICE_FEE());
		this.calculateTax(this.calculateSubTotal());
		System.out.println("Taxes:       $" + df.format(this.tax));
		System.out.println("Total (USD)               $" + tot);
	}
}
