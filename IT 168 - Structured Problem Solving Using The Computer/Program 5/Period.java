/*
 * Created on: Nov 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This class stores an array of appointments that represents the 60 minutes
 * that make up a period>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class Period
{
	private Appointment[] appoint;
	private static final int MAX_MINUITES = 60;

	public Period()
	{
		this.appoint = new Appointment[MAX_MINUITES];
		for (int i = 0; i < appoint.length; i++)
		{
			appoint[i] = new Appointment();
		}
	}

	public Appointment[] getAppoint()
	{
		Appointment[] arr = new Appointment[appoint.length];
		for (int i = 0; i < appoint.length; i++)
		{
			arr[i] = appoint[i];
		}
		return arr;
	}

	public String toString()
	{
		String str = "";
		for (int i = 0; i < appoint.length; i++)
		{
			System.out.println(str = "Minute: " + i + " Available: " + appoint[i].isAvailable());
		}
		return "";
	}
}
