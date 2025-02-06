/*
 * Created on: Nov 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This class contains an instance variable, that stores a Boolean value that
 * shows if the time slot is available>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class Appointment
{
	private boolean available;

	public Appointment()
	{
		this.available = true;
	}

	public boolean isAvailable()
	{
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}

	public String toString()
	{
		return "Is appointment available: " + isAvailable();
	}
}