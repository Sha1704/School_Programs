/*
 * Created on: Oct 23, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This class holds the relevant data for an address of a house that will be
 * later used in the AirbnbListing class>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class Address // Write UML diagram
{
	private int zipcode;
	private String city, state, address;

	public Address(String address, String city, String state, int zipcode)
	{
		this.city = city;
		this.state = state;
		this.address = address;
		this.zipcode = zipcode;
	}

	public int getZipcode()
	{
		return zipcode;
	}

	public void setZipcode(int zipcode)
	{
		this.zipcode = zipcode;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String toString()
	{
		String output = address + "\n" + city + " " + state + " " + zipcode;
		return output;
	}
}
