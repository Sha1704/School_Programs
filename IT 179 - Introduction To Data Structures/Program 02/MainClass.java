/*
 * Created on: Feb 11, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <This class has the main method that controls the flow of this program as well as the menu method that displays the menu used in this class>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainClass
{
	static ArrayList <Patient> patients = new ArrayList<Patient>();
	
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner (System.in);
			
			
			menu();
			int input = scan.nextInt();
			
			if (input <= 0 || input > 6)
			{
				while (input <= 0 || input > 6)
				{
					System.out.println("Invalid input, enter a number 1-6");
					input = scan.nextInt();
				}
			}
				while (input != 6)
				{
					if (input == 1)
					{
						System.out.print("Is the PCR test result positive? (enter yes or no): ");
						String result = scan.next();
						
						while (!(result.equalsIgnoreCase("yes") || result.equalsIgnoreCase("no")))
						{
							System.out.print("Please enter yes or no: ");
							result = scan.next();
						}
						
						if (result.equalsIgnoreCase("yes"))
						{
							System.out.print ("What is the patient's age? ");
							int age = scan.nextInt();
							System.out.print ("What is the patient's first name? ");
							String fName = scan.next();
							System.out.print ("What is the patient's last name? ");
							String lName = scan.next();
							System.out.print ("What is the patient's ID number? ");
							int id = scan.nextInt();
							System.out.print ("What is the patient's temperature? ");
							double temperature = scan.nextDouble();
							System.out.print ("Who is the patient's physician? ");
							String physician = scan.next();
							System.out.print ("Is the patient vaccinated? (please enter yes or no): ");
							String vax = scan.next();
							boolean vaccinated = false;
							
							if (vax.equalsIgnoreCase("yes"))
							{
								vaccinated = true;
							}
							else if (vax.equalsIgnoreCase("no"))
							{
								vaccinated = false;
							}
							else
							{
								while ( !(vax.equalsIgnoreCase("yes") || vax.equalsIgnoreCase("no")))
								{
									System.out.print ("Please enter yes or no: ");
									vax = scan.next();
								}
							}
							
							for (int i =0; i < patients.size(); i++)
							{
								while (patients.get(i).getId() == id)
								{
									System.out.print("There is a patient with the same id number, please enter another id number: ");
									id = scan.nextInt();
								}
							}
							Covid19Patient p1 = new Covid19Patient(id, fName, lName, physician, age, temperature, vaccinated);
							patients.add(p1);
						}
						else if (result.equalsIgnoreCase("no"))
						{
							System.out.print ("What is the patient's age? ");
							int age = scan.nextInt();
							System.out.print ("What is the patient's first name? ");
							String fName = scan.next();
							System.out.print ("What is the patient's last name? ");
							String lName = scan.next();
							System.out.print ("What is the patient's ID number? ");
							int id = scan.nextInt();
							System.out.print ("What is the patient's main symptom? ");
							String mainSymptom = scan.next();
							System.out.print ("Who is the patient's physician? ");
							String physician = scan.next();
							
							for (int i =0; i < patients.size(); i++)
							{
								while (patients.get(i).getId() == id)
								{
									System.out.print("There is a patient with the same id number, please enter another id number: ");
									id = scan.nextInt();
								}
							}
							
							RegularPatient p2 = new RegularPatient(id, fName, lName, physician, age, mainSymptom);
							patients.add(p2);
						}
			
						menu();
						input = scan.nextInt();
					}
					else if (input == 2)
					{
						boolean patientExist = false;
						for (int i = 0; i < patients.size(); i++)
						{
							if (patients.get(i) != null)
							{
								patientExist = true;
								System.out.println(patients.get(i).toString());
							}	
						}
						if (!patientExist)
						{
							System.out.println("There is no patient to print out information about, please add a patient");
						}
						
						
						menu();
						input = scan.nextInt();
					}
					else if (input == 3)
					{
						boolean found = false;
						boolean admitted = true;
						
						System.out.print("Please  enter the patient's ID: ");
						int id = scan.nextInt();
						
						System.out.print("Is the PCR test result positive? (enter yes or no): ");
						String result = scan.next();
						
						while (!(result.equalsIgnoreCase("yes") || result.equalsIgnoreCase("no")))
						{
							System.out.print("Please enter yes or no: ");
							result = scan.next();
						}
						
						if (patients.size() == 0)
						{
							System.out.println("No patient is currently admitted");
							admitted = false;
						}
						
						if (admitted)
						{
							for (int i = 0; i < patients.size(); i++)
							{
								
								if (patients.get(i).getId() == id)
								{
									if (result.equalsIgnoreCase("yes"))
									{
										patients.get(i).setPcr(true);
										int age = patients.get(i).getAge();
										String fName = patients.get(i).getfName();
										String lName = patients.get(i).getlName();
										int idNumber = patients.get(i).getId();
										String physician = patients.get(i).getPhysician();
										double temperature = ((Covid19Patient) patients.get(i)).getTemperature();
										boolean vacinated =((Covid19Patient) patients.get(i)).getVaccinated();
										
										System.out.println("What is the patient's temperatrue? ");
										double temp = scan.nextDouble();
										
										Covid19Patient p3 = new Covid19Patient(id, fName, lName, physician, age, temperature, vacinated);
										patients.remove(i);
										patients.add(p3);
										found = true;
									}
									else if (result.equalsIgnoreCase("no"))
									{
										patients.get(i).setPcr(false);
										int age = patients.get(i).getAge();
										String fName = patients.get(i).getfName();
										String lName = patients.get(i).getlName();
										int identity = patients.get(i).getId();
										String physician = patients.get(i).getPhysician();
										
										System.out.print("What is the patient's main symptom? ");
										String mainSymptom = scan.next();
										
										RegularPatient p4 = new RegularPatient(id, fName, lName, physician, age, mainSymptom);
										patients.remove(i);
										patients.add(p4);
										found = true;
									}
								}
							}
							if (!found)
							{
								System.out.println("No patient with that ID found");
							}
						}
						
						menu();
						input = scan.nextInt();
					}
					else if (input == 4)
					{
						int covidCount = 0;
						
						for (int i = 0; i < patients.size(); i++)
						{
							if (patients.get(i).getPcr() == true)
							{
								System.out.println(patients.get(i).getfName() + " " + patients.get(i).getlName() + " is a covid patient");
								System.out.print("What is the paitent's temperature? ");
								double temp = scan.nextDouble();
								covidCount++;
							}
							
							System.out.println(patients.get(i).getfName() + " " + patients.get(i).getlName() + " with the ID number: " + patients.get(i).getId() + " has a recomended treatment of: " + patients.get(i).treat());
						}
						if (covidCount == 0)
						{
							System.out.println("There are no covid patients currently admitted, please admit a patient.");
						}
						menu();
						input = scan.nextInt();
					}
					else if (input == 5) 
					{
						boolean idFound = false;
						
						System.out.println("What is the patient's ID number?");
						int idNo = scan.nextInt();
						
						for (int i = 0; i < patients.size(); i++)
						{
							if (patients.get(i).getId() == idNo)
							{
								idFound = true;
								if (!patients.get(i).getPcr())
								{
									patients.remove(i);
									System.out.println("Patient discharged");
								}
								else 
								{
									System.out.println("Patient not discharged (patient has a positive PCR test result)");
								}
								break;
							}
						}
						if (!idFound)
						{
							System.out.println("No patient with that ID found.");
						}
						
						menu();
						input = scan.nextInt();
					}
				}
				scan.close();			
				System.out.println("Goodbye!");
		}
		catch (InputMismatchException e)
		{
			System.out.println("You entered the wrong input, please restart the program and try again ");
		}
	}
	
	public static void menu()
	{
		System.out.println("Please choose one of the following options:");
		System.out.println("1 - Admit a patient");
		System.out.println("2 - Print patient information");
		System.out.println("3 - Submit a PCR test result");
		System.out.println("4 - Do rounds");
		System.out.println("5 - Discharge patient");
		System.out.println("6 - Exit");
	}
}
