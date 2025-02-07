/*
 * Created on: Apr 11, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * <This class controls the flow of the program and has some sample animals>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainMethod
{
	public static void main(String[] args)
	{
		try 
		{
			Zoo z1 = new Zoo();
			Scanner scan = new Scanner (System.in);
			
			// Sample animals
//			z1.addAnimal(new Animal("Leo", "Lion", 8, "Meat", "1 kg", 2));
//			z1.addAnimal(new Animal("Molly", "Elephant", 15, "Vegetables", "5 kg", 2));
//			z1.addAnimal(new Animal("Max", "Tiger", 5, "Meat", "1.5 kg", 2));
//			z1.addAnimal(new Animal("Bella", "Giraffe", 10, "Leaves", "2 kg", 1));
//			z1.addAnimal(new Animal("Buddy", "Zebra", 7, "Grass", "1.5 kg", 1));
//			z1.addAnimal(new Animal("Lucy", "Panda", 6, "Bamboo", "3 kg", 1));
//			z1.addAnimal(new Animal("Charlie", "Kangaroo", 4, "Vegetables", "1.5 kg", 2));
//			z1.addAnimal(new Animal("Luna", "Hippopotamus", 12, "Grass", "2 kg", 2));
//			z1.addAnimal(new Animal("Rocky", "Rhino", 9, "Grass", "2.5 kg", 1));
//			z1.addAnimal(new Animal("Daisy", "Penguin", 3, "Fish", "500 g", 3));
//			z1.addAnimal(new Animal("Oscar", "Orangutan", 11, "Fruits", "1 kg", 2));
//			z1.addAnimal(new Animal("Milo", "Monkey", 5, "Fruits", "800 g", 3));
//			z1.addAnimal(new Animal("Stella", "Sloth", 8, "Leaves", "2 kg", 1));
//			z1.addAnimal(new Animal("Zoe", "Zebra", 7, "Grass", "1.5 kg", 1));
//			z1.addAnimal(new Animal("Sam", "Snake", 4, "Rodents", "100 g", 4));

			displayMenu();
			int choice = scan.nextInt();
			scan.nextLine();
			
			while (choice !=8)
			{
				if (choice == 1)
				{
					System.out.print("Enter the animal's name: ");
					String name = scan.nextLine();
					System.out.print("Enter the animal's species: ");
					String species = scan.nextLine();
					System.out.print("Enter the animal's age: ");
					int age = scan.nextInt();
					while (age < 0)
					{
						System.out.print("Invalid age, enter a valid age: ");
						age = scan.nextInt();
					}
					scan.nextLine();
					System.out.print("Enter the animal's food: ");
					String food = scan.nextLine();
					System.out.print("Enter the animal's food amount: ");
					String foodAmount = scan.nextLine();
					System.out.print("Enter the animal's feedings per day: ");
					int feedingsPerDay = scan.nextInt();
					while (feedingsPerDay < 0)
					{
						System.out.print("Invalid number of feeding per day, enter a valid number of feeding per day: ");
						feedingsPerDay = scan.nextInt();
					}
					
					Animal a1 = new Animal(name, species, age, food, foodAmount, feedingsPerDay);
					z1.addAnimal(a1);
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 2)
				{
					System.out.print("Enter the name of the animal to remove: ");
					String animalName = scan.nextLine();
					
					z1.removeAnimal(animalName);
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 3)
				{
					
					z1.feedNext();
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 4)
				{
					
					z1.visitNext();
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 5)
				{
					z1.displayAnimals();
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 6)
				{
					z1.needFeeding();
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else if (choice == 7)
				{
					z1.vetVisit();
					
					displayMenu();
					choice = scan.nextInt();
					scan.nextLine();
				}
				else
				{
					while (choice < 1 || choice >8)
					{
						System.out.println("Please enter a valid number 1 - 8");
						choice = scan.nextInt();
					}
				}
			}
			System.out.println("Goodbye!");
		}
		catch (InputMismatchException e)
		{
			System.out.println("You have entered the wrong input type, plese restart the program.");
		}
	}
	
	private static void displayMenu()
	{
		System.out.println("Please choose one of the following options.");
		System.out.println("1. Add an animal");
		System.out.println("2. Remove an animal");
		System.out.println("3. Feed animal");
		System.out.println("4. Visit next animal");
		System.out.println("5. Display all animals");
		System.out.println("6. Display all animals that need feeding");
		System.out.println("7. Display all animals that needs to be visited");
		System.out.println("Choose an option form 1-7 (press 8 to quit): ");
	}
}
