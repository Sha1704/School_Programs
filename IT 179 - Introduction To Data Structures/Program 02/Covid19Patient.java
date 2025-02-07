/*
 * Created on: Feb 10, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This class has all the necessary methods to create and access a Covid 19 patient, it is also a child class of the patient class>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Covid19Patient extends Patient
{
	private double temperature;
	private boolean vaccinated;
	public Covid19Patient(int id, String fName, String lName, String physician, int age, double temperature, boolean vaccinated)
	{
		super(id,fName, lName, physician, age);
		this.temperature = temperature;
		this.vaccinated = vaccinated;
		setPcr(true);
	}
	
	
	public double getTemperature()
	{
		return temperature;
	}


	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}
	
	
	
	public boolean getVaccinated()
	{
		return vaccinated;
	}


	public void setVaccinated(boolean vaccinated)
	{
		this.vaccinated = vaccinated;
	}


	public String treat()
	{
		String str = "";
		
		if (getAge() > 59 || getTemperature() > 36.5)
		{
			str = "Paxlovid";
		}
		else
		{
			str = "fluids and Acetaminophen";
		}
		
		if (getTemperature() > 40)
		{
			str += " and Dexamethasone";
		}
		return str;
	}
	
	public String toString()
	{
		String str = "Id: " + getId() + "\nFull name: " + getfName() + " " + getlName() +
				"\nAge: " + getAge() + "\nPhysician: " + getPhysician() + "\nTemperature: " + getTemperature()
				+ "\nPCR test result: " + getPcr() + "\nVaccinated: " + vaccinated +
				"\nTreatment: " + treat() + "\n";
		
		return str;
	}
}
