/*
 * Created on: Feb 11, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This class has all the necessary methods to create and access a regular patient, it is also a child class of the patient class>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class RegularPatient extends Patient
{
	private String mainSymptom;
	
	public RegularPatient(int id, String fName, String lName,String physician, int age, String mainSymptom)
	{
		super(id,fName, lName, physician, age);
		this.mainSymptom = mainSymptom;
		setPcr(false);
	}
	
	
	public String treat()
	{
		String str = "";
		
		if (mainSymptom.equalsIgnoreCase("upper respiratory tract infections"))
		{
			str = "Amoxicillin";
		}
		else if (mainSymptom.equalsIgnoreCase("hypertension"))
		{
			str = "ACE inhibitors";
		}
		else
		{
			str = "IV fluids";
		}
		return str;
	}
	
	public String toString()
	{
		String str = "Id: " + getId() + "\nFull name: " + getfName() + " " + getlName() +
				"\nAge: " + getAge() + "\nPhysician: " + getPhysician() + "\nMain symptom: " + mainSymptom
				+ "\nPCR test result: " + getPcr() + "\nTreatment: " + treat() + "\n";
		
		return str;
	}
}
