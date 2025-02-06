/* 
* Created on: Dec 1, 2023 
* 
* ULID: <sadibos> 
* Class: IT 168  
*/ 
package edu.ilstu;

/** 
* <This class makes a vehicle with attributes like as plate number, year built, manufacturer, model, exterior color, acquisition date, cost, value, work needed status, and related work notes.
* It also has all the required getters and setters as well as the toString() method> 
* 
* @author <Shalom Adiboshi; 
*  
*/
public class Vehicle 
{
	private int yearBuilt;
	private String manufacturer, vehicleType, model, exteriorColor, plateNumber, dateAcquired, workNotes;
	private boolean workNeeded;
	private double cost, value;
	
	public Vehicle() 
	{
		
	}
	
	public Vehicle(String plateNumber, int yearBuilt, String dateAcquired, String manufacturer, String vehicleType,
			String model, String exteriorColor, boolean workNeeded, String workNotes, double cost, double value) 
	{
		this.plateNumber = plateNumber;
		this.yearBuilt = yearBuilt;
		this.dateAcquired = dateAcquired;
		this.manufacturer = manufacturer;
		this.vehicleType = vehicleType;
		this.model = model;
		this.exteriorColor = exteriorColor;
		this.workNeeded = workNeeded;
		this.workNotes = workNotes;
		this.cost = cost;
		this.value = value;
	}

	public String getPlateNumber() 
	{
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) 
	{
		this.plateNumber = plateNumber;
	}

	public boolean getWorkNeeded() 
	{
		return workNeeded;
	}

	public void setWorkNeeded(boolean workNeeded) 
	{
		this.workNeeded = workNeeded;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}

	public String getVehicleType() 
	{
		return vehicleType;
	}

	public String getModel() 
	{
		return model;
	}

	public void setExteriorColor(String exteriorColor) 
	{
		this.exteriorColor = exteriorColor;
	}

	public void setWorkNotes(String workNotes) 
	{
		this.workNotes = workNotes;
	}

	public void setValue(double value)
	{
		this.value = value;
	}
	
	public int getYearBuilt()
	{
		return yearBuilt;
	}

	public String getExteriorColor()
	{
		return exteriorColor;
	}

	public double getCost()
	{
		return cost;
	}

	public double getValue()
	{
		return value;
	}

	public String getWorkNotes()
	{
		return workNotes;
	}

	public String getDateAcquired()
	{
		return dateAcquired;
	}
	
	public String toString()
	{
		    return "JAY’S VEHICLE COLLECTION\nTag No. Year Manuf. Model Type Acquired\n" +
		            plateNumber + " " + yearBuilt + " " + manufacturer + " " + model + " " + vehicleType + " " + dateAcquired;
	}
}
