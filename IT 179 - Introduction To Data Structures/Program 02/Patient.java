/*
 * Created on: Feb 10, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This class has all the methods required to create and access information about any type of patient>
 *
 * @author <Adiboshi Shalom;
 *
 */
public abstract class Patient
{
	private int id, age;
	private String fName, lName;
	protected String physician;
	private boolean pcr;
	
	public Patient(int id, String fName, String lName, String physician, int age)
	{
		this.age = age;
		this.fName = fName;
		this.lName = lName;
		this.id = id;
		this.physician = physician;
	}
	
	public boolean getPcr()
	{
		return pcr;
	}

	public void setPcr(boolean pcr)
	{
		this.pcr = pcr;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	public String getPhysician()
	{
		return physician;
	}

	public void setPhysician(String physician)
	{
		this.physician = physician;
	}

	public abstract String treat();
	
	public String toString()
	{
		String str = "The patient's name is: " + getfName() + " " + getlName() + "\nThe patient's age is: " + getAge() + "\nThe patient's id number is: " + getId() + "\nTheir physician is: " + getPhysician();
		return str;
	}
}
